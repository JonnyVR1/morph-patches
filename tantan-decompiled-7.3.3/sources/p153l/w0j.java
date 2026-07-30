package p153l;

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
public class w0j {

    /* JADX INFO: renamed from: l.w0j$a */
    @RequiresApi(21)
    public static class C20972a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m204189a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: renamed from: l.w0j$b */
    public interface InterfaceC20973b {
    }

    /* JADX INFO: renamed from: l.w0j$c */
    public static final class C20974c implements InterfaceC20973b {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final C20975d[] f186600a;

        public C20974c(@NonNull C20975d[] c20975dArr) {
            this.f186600a = c20975dArr;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C20975d[] m204190a() {
            return this.f186600a;
        }
    }

    /* JADX INFO: renamed from: l.w0j$d */
    public static final class C20975d {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f186601a;

        /* JADX INFO: renamed from: b */
        public final int f186602b;

        /* JADX INFO: renamed from: c */
        public final boolean f186603c;

        /* JADX INFO: renamed from: d */
        public final String f186604d;

        /* JADX INFO: renamed from: e */
        public final int f186605e;

        /* JADX INFO: renamed from: f */
        public final int f186606f;

        public C20975d(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.f186601a = str;
            this.f186602b = i;
            this.f186603c = z;
            this.f186604d = str2;
            this.f186605e = i2;
            this.f186606f = i3;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m204191a() {
            return this.f186601a;
        }

        /* JADX INFO: renamed from: b */
        public int m204192b() {
            return this.f186606f;
        }

        /* JADX INFO: renamed from: c */
        public int m204193c() {
            return this.f186605e;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public String m204194d() {
            return this.f186604d;
        }

        /* JADX INFO: renamed from: e */
        public int m204195e() {
            return this.f186602b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m204196f() {
            return this.f186603c;
        }
    }

    /* JADX INFO: renamed from: l.w0j$e */
    public static final class C20976e implements InterfaceC20973b {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final t0j f186607a;

        /* JADX INFO: renamed from: b */
        public final int f186608b;

        /* JADX INFO: renamed from: c */
        public final int f186609c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f186610d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C20976e(@NonNull t0j t0jVar, int i, int i2, @Nullable String str) {
            this.f186607a = t0jVar;
            this.f186609c = i;
            this.f186608b = i2;
            this.f186610d = str;
        }

        /* JADX INFO: renamed from: a */
        public int m204197a() {
            return this.f186609c;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public t0j m204198b() {
            return this.f186607a;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public String m204199c() {
            return this.f186610d;
        }

        /* JADX INFO: renamed from: d */
        public int m204200d() {
            return this.f186608b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m204181a(TypedArray typedArray, int i) {
        return C20972a.m204189a(typedArray, i);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static InterfaceC20973b m204182b(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m204184d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<List<byte[]>> m204183c(@NonNull Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m204181a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m204188h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m204188h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static InterfaceC20973b m204184d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m204185e(xmlPullParser, resources);
        }
        m204187g(xmlPullParser);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static InterfaceC20973b m204185e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), aic0.f71501g);
        String string = typedArrayObtainAttributes.getString(aic0.f71502h);
        String string2 = typedArrayObtainAttributes.getString(aic0.f71506l);
        String string3 = typedArrayObtainAttributes.getString(aic0.f71507m);
        int resourceId = typedArrayObtainAttributes.getResourceId(aic0.f71503i, 0);
        int integer = typedArrayObtainAttributes.getInteger(aic0.f71504j, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(aic0.f71505k, 500);
        String string4 = typedArrayObtainAttributes.getString(aic0.f71508n);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m204187g(xmlPullParser);
            }
            return new C20976e(new t0j(string, string2, string3, m204183c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m204186f(xmlPullParser, resources));
                } else {
                    m204187g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C20974c((C20975d[]) arrayList.toArray(new C20975d[0]));
    }

    /* JADX INFO: renamed from: f */
    public static C20975d m204186f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), aic0.f71509o);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(aic0.f71518x) ? aic0.f71518x : aic0.f71511q, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(aic0.f71516v) ? aic0.f71516v : aic0.f71512r, 0);
        int i2 = typedArrayObtainAttributes.hasValue(aic0.f71519y) ? aic0.f71519y : aic0.f71513s;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(aic0.f71517w) ? aic0.f71517w : aic0.f71514t);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(aic0.f71515u) ? aic0.f71515u : aic0.f71510p;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m204187g(xmlPullParser);
        }
        return new C20975d(string2, i, z, string, i3, resourceId);
    }

    /* JADX INFO: renamed from: g */
    public static void m204187g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
    public static List<byte[]> m204188h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
