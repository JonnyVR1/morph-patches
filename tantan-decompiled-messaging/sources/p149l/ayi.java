package p149l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ayi {

    /* JADX INFO: renamed from: l.ayi$a */
    @RequiresApi(21)
    public static class C15758a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m99553a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: renamed from: l.ayi$b */
    public interface InterfaceC15759b {
    }

    /* JADX INFO: renamed from: l.ayi$c */
    public static final class C15760c implements InterfaceC15759b {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C15761d[] f72282a;

        public C15760c(@NonNull C15761d[] c15761dArr) {
            this.f72282a = c15761dArr;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C15761d[] m99554a() {
            return this.f72282a;
        }
    }

    /* JADX INFO: renamed from: l.ayi$d */
    public static final class C15761d {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f72283a;

        /* JADX INFO: renamed from: b */
        public final int f72284b;

        /* JADX INFO: renamed from: c */
        public final boolean f72285c;

        /* JADX INFO: renamed from: d */
        public final String f72286d;

        /* JADX INFO: renamed from: e */
        public final int f72287e;

        /* JADX INFO: renamed from: f */
        public final int f72288f;

        public C15761d(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.f72283a = str;
            this.f72284b = i;
            this.f72285c = z;
            this.f72286d = str2;
            this.f72287e = i2;
            this.f72288f = i3;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m99555a() {
            return this.f72283a;
        }

        /* JADX INFO: renamed from: b */
        public int m99556b() {
            return this.f72288f;
        }

        /* JADX INFO: renamed from: c */
        public int m99557c() {
            return this.f72287e;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public String m99558d() {
            return this.f72286d;
        }

        /* JADX INFO: renamed from: e */
        public int m99559e() {
            return this.f72284b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m99560f() {
            return this.f72285c;
        }
    }

    /* JADX INFO: renamed from: l.ayi$e */
    public static final class C15762e implements InterfaceC15759b {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final xxi f72289a;

        /* JADX INFO: renamed from: b */
        public final int f72290b;

        /* JADX INFO: renamed from: c */
        public final int f72291c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f72292d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C15762e(@NonNull xxi xxiVar, int i, int i2, @Nullable String str) {
            this.f72289a = xxiVar;
            this.f72291c = i;
            this.f72290b = i2;
            this.f72292d = str;
        }

        /* JADX INFO: renamed from: a */
        public int m99561a() {
            return this.f72291c;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public xxi m99562b() {
            return this.f72289a;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public String m99563c() {
            return this.f72292d;
        }

        /* JADX INFO: renamed from: d */
        public int m99564d() {
            return this.f72290b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m99545a(TypedArray typedArray, int i) {
        return C15758a.m99553a(typedArray, i);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static InterfaceC15759b m99546b(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m99548d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<List<byte[]>> m99547c(@NonNull Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m99545a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m99552h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m99552h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static InterfaceC15759b m99548d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m99549e(xmlPullParser, resources);
        }
        m99551g(xmlPullParser);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static InterfaceC15759b m99549e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), u9c0.f175232g);
        String string = typedArrayObtainAttributes.getString(u9c0.f175233h);
        String string2 = typedArrayObtainAttributes.getString(u9c0.f175237l);
        String string3 = typedArrayObtainAttributes.getString(u9c0.f175238m);
        int resourceId = typedArrayObtainAttributes.getResourceId(u9c0.f175234i, 0);
        int integer = typedArrayObtainAttributes.getInteger(u9c0.f175235j, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(u9c0.f175236k, 500);
        String string4 = typedArrayObtainAttributes.getString(u9c0.f175239n);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m99551g(xmlPullParser);
            }
            return new C15762e(new xxi(string, string2, string3, m99547c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m99550f(xmlPullParser, resources));
                } else {
                    m99551g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C15760c((C15761d[]) arrayList.toArray(new C15761d[0]));
    }

    /* JADX INFO: renamed from: f */
    public static C15761d m99550f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), u9c0.f175240o);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(u9c0.f175249x) ? u9c0.f175249x : u9c0.f175242q, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(u9c0.f175247v) ? u9c0.f175247v : u9c0.f175243r, 0);
        int i2 = typedArrayObtainAttributes.hasValue(u9c0.f175250y) ? u9c0.f175250y : u9c0.f175244s;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(u9c0.f175248w) ? u9c0.f175248w : u9c0.f175245t);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(u9c0.f175246u) ? u9c0.f175246u : u9c0.f175241p;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m99551g(xmlPullParser);
        }
        return new C15761d(string2, i, z, string, i3, resourceId);
    }

    /* JADX INFO: renamed from: g */
    public static void m99551g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static List<byte[]> m99552h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
