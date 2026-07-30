package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class ClobSeriliazer implements ObjectSerializer {
    public static final ClobSeriliazer instance = new ClobSeriliazer();

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        try {
            if (obj == null) {
                jSONSerializer.writeNull();
                return;
            }
            Reader characterStream = ((Clob) obj).getCharacterStream();
            StringBuilder sb = new StringBuilder();
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i2 = characterStream.read(cArr, 0, 2048);
                    if (i2 < 0) {
                        String string = sb.toString();
                        characterStream.close();
                        jSONSerializer.write(string);
                        return;
                    }
                    sb.append(cArr, 0, i2);
                }
            } catch (Exception e) {
                throw new JSONException("read string from reader error", e);
            }
        } catch (SQLException e2) {
            throw new IOException("write clob error", e2);
        }
    }
}
