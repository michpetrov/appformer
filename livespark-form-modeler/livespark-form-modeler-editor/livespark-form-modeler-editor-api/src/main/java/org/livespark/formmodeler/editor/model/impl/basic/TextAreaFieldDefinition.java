/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.livespark.formmodeler.editor.model.impl.basic;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.livespark.formmodeler.editor.model.FieldDefinition;

/**
 * Created by pefernan on 3/19/15.
 */
@Portable
public class TextAreaFieldDefinition extends FieldDefinition {

    protected Integer rows = 4;
    protected Integer cols = 15;
    protected String placeHolder;

    public Integer getRows() {
        return rows;
    }

    public void setRows( Integer rows ) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols( Integer cols ) {
        this.cols = cols;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder( String placeHolder ) {
        this.placeHolder = placeHolder;
    }

    @Override
    public String getStandaloneClassName() {
        return String.class.getName();
    }
}