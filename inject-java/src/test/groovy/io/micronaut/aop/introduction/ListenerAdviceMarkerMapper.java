/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.aop.introduction;

import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.inject.annotation.TypedAnnotationMapper;
import io.micronaut.inject.visitor.VisitorContext;

import java.util.ArrayList;
import java.util.List;

public class ListenerAdviceMarkerMapper implements TypedAnnotationMapper<ListenerAdviceMarker> {
    @Override
    public Class<ListenerAdviceMarker> annotationType() {
        return ListenerAdviceMarker.class;
    }

    @Override
    public List<AnnotationValue<?>> map(AnnotationValue<ListenerAdviceMarker> annotation, VisitorContext visitorContext) {
        List<AnnotationValue<?>> mappedAnnotations = new ArrayList<>();
        mappedAnnotations.add(AnnotationValue.builder(ListenerAdvice.class).build());
        return mappedAnnotations;
    }
}
