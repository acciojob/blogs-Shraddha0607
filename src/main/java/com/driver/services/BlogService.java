package com.driver.services;

import com.driver.models.Blog;
import com.driver.models.Image;
import com.driver.models.User;
import com.driver.repositories.BlogRepository;
import com.driver.repositories.ImageRepository;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository1;

    @Autowired
    UserRepository userRepository1;

    public Blog createAndReturnBlog(Integer userId, String title, String content) {
        //create a blog at the current time
        User user = blogRepository1.findById(userId).get().getUser();
        Blog blog = new Blog(title, content, user);
        return blog;
    }

//    public String associateCardAndStudent(Integer cardId,Integer studentId){
//
//        LibraryCard libraryCard = cardRepository.findById(cardId).get();
//        Student student = studentRepository.findById(studentId).get();
//        libraryCard.setCardStatus(CardStatus.ISSUED);
//        libraryCard.setStudent(student); //Indirectly setting the FK in LC table
//        //but bcz we are playing with entities so we will have to set as per the entity
//        cardRepository.save(libraryCard);
//        return "The card and student has been associated";
//    }

    public void deleteBlog(int blogId){
        //delete blog and corresponding images
        blogRepository1.deleteById(blogId);
    }
}
