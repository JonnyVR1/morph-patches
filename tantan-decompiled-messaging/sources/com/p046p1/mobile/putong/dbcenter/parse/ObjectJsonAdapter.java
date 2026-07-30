package com.p046p1.mobile.putong.dbcenter.parse;

import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.p046p1.mobile.putong.data.Data;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p149l.rpq;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ObjectJsonAdapter<T extends ValueObject> extends JsonAdapter<T> {
    private void addExtDataToModuleData(ArrayList<BaseData> arrayList, String str, ValueObject valueObject) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        for (BaseData baseData : arrayList) {
            if (TextUtils.equals(str, baseData.getClass().getName())) {
                baseData.addExtData(valueObject);
            }
        }
    }

    private void parseOnce(JsonParser jsonParser, ObjectJsonAdapter objectJsonAdapter, ValueObject valueObject, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker, boolean z) throws IOException {
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            valueObject.putParsedField(currentName);
            jsonParser.nextToken();
            objectJsonAdapter.parseField(valueObject, currentName, jsonParser, str, arrayList, dataChecker);
            jsonParser.skipChildren();
        }
        if (z || valueObject == null) {
            return;
        }
        valueObject.nullCheck();
        valueObject.onApiParseComplete();
    }

    public abstract T newInstance();

    @Override // com.tantanapp.common.data.JsonAdapter
    public T parse(JsonParser jsonParser, String str, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
        ValueObject valueObject;
        boolean z;
        ArrayList<ValueObject> arrayList2;
        HashMap map;
        ValueObject valueObject2;
        ValueObject valueObjectNewInstance = newInstance();
        String classParseName = valueObjectNewInstance.getClassParseName();
        String str2 = str;
        valueObjectNewInstance.setParsedApiRequest(str2);
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        if (valueObjectNewInstance instanceof Data) {
            valueObject = (T) valueObjectNewInstance;
            JsonParser jsonParser2 = jsonParser;
            ArrayList<ObjectJsonAdapter> arrayListM180388a = rpq.m180387b().m180388a();
            ArrayList<Pair> arrayList3 = new ArrayList();
            ArrayList<BaseData> arrayList4 = new ArrayList<>();
            for (ObjectJsonAdapter objectJsonAdapter : arrayListM180388a) {
                BaseData baseData = (BaseData) objectJsonAdapter.newInstance();
                arrayList3.add(new Pair(baseData, objectJsonAdapter));
                arrayList4.add(baseData);
            }
            while (jsonParser2.nextToken() != JsonToken.END_OBJECT) {
                String currentName = jsonParser2.getCurrentName();
                jsonParser2.nextToken();
                if (JsonParseHelper.parseTimes(arrayList3, currentName) > 1) {
                    JsonFactory jsonFactoryJSON_FACTORY = JsonAdapter.JSON_FACTORY();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    JsonGenerator jsonGeneratorCreateGenerator = jsonFactoryJSON_FACTORY.createGenerator(new PrintWriter(byteArrayOutputStream));
                    JsonParseHelper.readJsonBegin(jsonParser2, jsonGeneratorCreateGenerator);
                    jsonGeneratorCreateGenerator.flush();
                    jsonGeneratorCreateGenerator.close();
                    String string = byteArrayOutputStream.toString();
                    byteArrayOutputStream.close();
                    for (Pair pair : arrayList3) {
                        JsonParser jsonParserCreateParser = jsonFactoryJSON_FACTORY.createParser(string);
                        jsonParserCreateParser.nextToken();
                        if (((ObjectJsonAdapter) pair.second).parseField((BaseData) pair.first, currentName, jsonParserCreateParser, str, arrayList4, dataChecker) || TextUtils.equals(currentName, "id")) {
                            ((BaseData) pair.first).putParsedField(currentName);
                        }
                    }
                } else {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Pair pair2 = (Pair) it.next();
                            boolean field = ((ObjectJsonAdapter) pair2.second).parseField((BaseData) pair2.first, currentName, jsonParser2, str, arrayList4, dataChecker);
                            if (field || TextUtils.equals(currentName, "id")) {
                                ((BaseData) pair2.first).putParsedField(currentName);
                            }
                            if (field) {
                                break;
                            }
                            jsonParser2 = jsonParser;
                        }
                    }
                    jsonParser.skipChildren();
                    jsonParser2 = jsonParser;
                }
                jsonParser.skipChildren();
                jsonParser2 = jsonParser;
            }
            Data data = (Data) valueObject;
            data.dataList = new ArrayList<>();
            for (Pair pair3 : arrayList3) {
                ((BaseData) pair3.first).nullCheck();
                ((BaseData) pair3.first).onApiParseComplete();
                data.dataList.add((BaseData) pair3.first);
            }
        } else {
            ArrayList<Pair<String, ObjectJsonAdapter>> arrayListM180389c = rpq.m180387b().m180389c(classParseName);
            if (arrayListM180389c == null || arrayListM180389c.size() <= 0) {
                z = false;
                arrayList2 = null;
                map = null;
            } else {
                HashMap map2 = new HashMap();
                ArrayList<ValueObject> arrayList5 = new ArrayList<>();
                z = false;
                for (Pair<String, ObjectJsonAdapter> pair4 : arrayListM180389c) {
                    ValueObject valueObjectNewInstance2 = ((ObjectJsonAdapter) pair4.second).newInstance();
                    arrayList5.add(valueObjectNewInstance2);
                    map2.put(valueObjectNewInstance2.getClass().getName(), (ObjectJsonAdapter) pair4.second);
                    addExtDataToModuleData(arrayList, (String) pair4.first, valueObjectNewInstance2);
                    z = true;
                }
                arrayList2 = arrayList5;
                map = map2;
            }
            if (z) {
                JsonFactory jsonFactoryJSON_FACTORY2 = JsonAdapter.JSON_FACTORY();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                JsonGenerator jsonGeneratorCreateGenerator2 = jsonFactoryJSON_FACTORY2.createGenerator(new PrintWriter(byteArrayOutputStream2));
                JsonParseHelper.readJsonBegin(jsonParser, jsonGeneratorCreateGenerator2);
                jsonGeneratorCreateGenerator2.flush();
                jsonGeneratorCreateGenerator2.close();
                String string2 = byteArrayOutputStream2.toString();
                byteArrayOutputStream2.close();
                int size = arrayList2.size() + 1;
                int i = 0;
                while (i < size) {
                    JsonParser jsonParserCreateParser2 = jsonFactoryJSON_FACTORY2.createParser(string2);
                    if (i < arrayList2.size()) {
                        ValueObject valueObject3 = arrayList2.get(i);
                        this.parseOnce(jsonParserCreateParser2, (ObjectJsonAdapter) map.get(valueObject3.getClass().getName()), valueObject3, str2, arrayList, dataChecker, false);
                        valueObject2 = valueObjectNewInstance;
                    } else {
                        ValueObject valueObject4 = valueObjectNewInstance;
                        parseOnce(jsonParserCreateParser2, this, valueObject4, str, arrayList, dataChecker, true);
                        valueObject2 = valueObject4;
                    }
                    i++;
                    this = this;
                    str2 = str;
                    arrayList = arrayList;
                    valueObjectNewInstance = valueObject2;
                }
                valueObject = (T) valueObjectNewInstance;
            } else {
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String currentName2 = jsonParser.getCurrentName();
                    valueObjectNewInstance.putParsedField(currentName2);
                    jsonParser.nextToken();
                    parseField(valueObjectNewInstance, currentName2, jsonParser, str, arrayList, dataChecker);
                    jsonParser.skipChildren();
                }
                valueObject = valueObjectNewInstance;
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                valueObject.setExtTabList(arrayList2);
            }
        }
        if (dataChecker != 0 && dataChecker.needCheck(valueObject) && dataChecker.netDataErrorCheck(valueObject)) {
            throw new DataCheckException("parsed error");
        }
        valueObject.nullCheck();
        valueObject.onApiParseComplete();
        return (T) valueObject;
    }

    public abstract boolean parseField(T t, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException;

    public boolean parseFieldCheck(T t, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
        return false;
    }

    @Override // com.tantanapp.common.data.JsonAdapter
    public final void serialize(T t, JsonGenerator jsonGenerator, boolean z) throws IOException {
        if (t == null) {
            jsonGenerator.writeNull();
            return;
        }
        if (z) {
            jsonGenerator.writeStartObject();
        }
        serializeFields(t.beforeApiSerialize(), jsonGenerator);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public abstract void serializeFields(T t, JsonGenerator jsonGenerator) throws IOException;

    @Override // com.tantanapp.common.data.JsonAdapter
    public /* bridge */ /* synthetic */ Object parse(JsonParser jsonParser, String str, ArrayList arrayList, DataChecker dataChecker) throws IOException {
        return parse(jsonParser, str, (ArrayList<BaseData>) arrayList, dataChecker);
    }
}
