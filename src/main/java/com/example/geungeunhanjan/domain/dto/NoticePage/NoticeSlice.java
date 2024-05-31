package com.example.geungeunhanjan.domain.dto.NoticePage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoticeSlice<T> {
//    화살표가 안생김  + 2로변경해둠
    boolean hasNext;
    List<T> contentList;
}