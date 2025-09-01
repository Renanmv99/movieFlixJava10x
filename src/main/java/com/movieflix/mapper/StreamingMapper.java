package com.movieflix.mapper;

import com.movieflix.controller.request.StreamingRequest;
import com.movieflix.controller.response.StreamingResponse;
import com.movieflix.entity.Streaming;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamingMapper {
    public static Streaming toStreaming(StreamingRequest request){
        return Streaming
                .builder()
                .name(request.name())
                .build();
    }

    public static StreamingResponse toStreamingResponse(Streaming response){
        return StreamingResponse
                .builder()
                .id(response.getId())
                .name(response.getName())
                .build();
    }
}
