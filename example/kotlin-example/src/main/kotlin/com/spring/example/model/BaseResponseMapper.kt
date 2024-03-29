package com.spring.example.model

import com.spring.example.openapi.model.BaseResponseDTO
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface BaseResponseMapper {
    fun parse(input: BaseResponseDTO): BaseResponse
    fun parse(input: BaseResponse): BaseResponseDTO
}
