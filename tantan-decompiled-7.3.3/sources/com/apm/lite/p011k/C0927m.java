package com.apm.lite.p011k;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.lite.k.m */
/* JADX INFO: loaded from: classes.dex */
public class C0927m {

    /* JADX INFO: renamed from: a */
    final Writer f4212a;

    /* JADX INFO: renamed from: b */
    private final List<a> f4213b = new ArrayList();

    /* JADX INFO: renamed from: com.apm.lite.k.m$a */
    public enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public C0927m(Writer writer) {
        this.f4212a = writer;
    }

    /* JADX INFO: renamed from: f */
    private void m5146f(a aVar) {
        List<a> list = this.f4213b;
        list.set(list.size() - 1, aVar);
    }

    /* JADX INFO: renamed from: g */
    private void m5147g(JSONArray jSONArray) throws JSONException, IOException {
        m5155a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m5158d(jSONArray.get(i));
        }
        m5160k();
    }

    /* JADX INFO: renamed from: h */
    public static void m5148h(JSONArray jSONArray, Writer writer) throws JSONException, IOException {
        new C0927m(writer).m5147g(jSONArray);
        writer.flush();
    }

    /* JADX INFO: renamed from: i */
    private void m5149i(JSONObject jSONObject) throws JSONException {
        m5161m();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m5159e(next).m5158d(jSONObject.get(next));
        }
        m5162n();
    }

    /* JADX INFO: renamed from: j */
    public static void m5150j(JSONObject jSONObject, Writer writer) throws JSONException, IOException {
        new C0927m(writer).m5149i(jSONObject);
        writer.flush();
    }

    /* JADX INFO: renamed from: l */
    private void m5151l(String str) throws IOException {
        Writer writer;
        String str2;
        Writer writer2;
        this.f4212a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                writer = this.f4212a;
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                    this.f4212a.write(92);
                    writer2 = this.f4212a;
                } else {
                    switch (cCharAt) {
                        case '\b':
                            writer = this.f4212a;
                            str2 = "\\b";
                            break;
                        case '\t':
                            writer = this.f4212a;
                            str2 = "\\t";
                            break;
                        case '\n':
                            writer = this.f4212a;
                            str2 = "\\n";
                            break;
                        default:
                            writer2 = this.f4212a;
                            if (cCharAt <= 31) {
                                writer2.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                }
                writer2.write(cCharAt);
            } else {
                writer = this.f4212a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f4212a.write("\"");
    }

    /* JADX INFO: renamed from: o */
    private a m5152o() {
        List<a> list = this.f4213b;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: p */
    private void m5153p() throws JSONException, IOException {
        a aVarM5152o = m5152o();
        if (aVarM5152o == a.NONEMPTY_OBJECT) {
            this.f4212a.write(44);
        } else if (aVarM5152o != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m5146f(a.DANGLING_KEY);
    }

    /* JADX INFO: renamed from: q */
    private void m5154q() throws JSONException, IOException {
        if (this.f4213b.isEmpty()) {
            return;
        }
        a aVarM5152o = m5152o();
        if (aVarM5152o == a.EMPTY_ARRAY) {
            m5146f(a.NONEMPTY_ARRAY);
            return;
        }
        if (aVarM5152o == a.NONEMPTY_ARRAY) {
            this.f4212a.write(44);
        } else if (aVarM5152o == a.DANGLING_KEY) {
            this.f4212a.write(":");
            m5146f(a.NONEMPTY_OBJECT);
        } else if (aVarM5152o != a.NULL) {
            throw new JSONException("Nesting problem");
        }
    }

    /* JADX INFO: renamed from: a */
    public C0927m m5155a() {
        return m5157c(a.EMPTY_ARRAY, "[");
    }

    /* JADX INFO: renamed from: b */
    public C0927m m5156b(a aVar, a aVar2, String str) throws IOException {
        m5152o();
        List<a> list = this.f4213b;
        list.remove(list.size() - 1);
        this.f4212a.write(str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0927m m5157c(a aVar, String str) throws JSONException, IOException {
        m5154q();
        this.f4213b.add(aVar);
        this.f4212a.write(str);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0927m m5158d(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            m5147g((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            m5149i((JSONObject) obj);
            return this;
        }
        m5154q();
        if (obj == null || obj == JSONObject.NULL) {
            this.f4212a.write("null");
            return this;
        }
        if (obj instanceof Boolean) {
            this.f4212a.write(String.valueOf(obj));
            return this;
        }
        if (obj instanceof Number) {
            this.f4212a.write(JSONObject.numberToString((Number) obj));
            return this;
        }
        m5151l(obj.toString());
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0927m m5159e(String str) throws JSONException, IOException {
        m5153p();
        m5151l(str);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C0927m m5160k() {
        return m5156b(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, Constants.AES_SUFFIX);
    }

    /* JADX INFO: renamed from: m */
    public C0927m m5161m() {
        return m5157c(a.EMPTY_OBJECT, "{");
    }

    /* JADX INFO: renamed from: n */
    public C0927m m5162n() {
        return m5156b(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
