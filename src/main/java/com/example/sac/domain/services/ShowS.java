package com.example.sac.domain.services;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.sac.web.dtos.EventD;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface ShowS {

        void registerEvent(EventD a, List<String> subject, List<Integer> price, MultipartFile poster,
                        List<MultipartFile> detail);

        String getShowList(Model m);

        String getShowDetail(long eventId, Model m, RedirectAttributes ra);

        String deleteEventWithId(long evid);

        String saveEditedEvent(EventD a, List<String> subject, List<Integer> price, MultipartFile poster_file,
                        List<MultipartFile> copyOf, String deletePoster, List<Long> deleteDetails);

        String getShowIndex(Model m);

        String purchaseTicketS(long eventId, Model m, EventD event, Principal p, String ticketClass, int ticketPrice,
                        LocalDateTime showTime);

        String toPurchaseS(long eventId, Model m);

}
