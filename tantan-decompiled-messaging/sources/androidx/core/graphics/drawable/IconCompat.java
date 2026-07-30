package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p149l.ig3;
import p149l.j850;
import p149l.kg3;
import p149l.rkq0;
import p149l.tf80;
import p149l.w050;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1452k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f1453a;

    /* JADX INFO: renamed from: b */
    public Object f1454b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] f1455c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable f1456d;

    /* JADX INFO: renamed from: e */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f1457e;

    /* JADX INFO: renamed from: f */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f1458f;

    /* JADX INFO: renamed from: g */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList f1459g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1460h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f1461i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f1462j;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    @RequiresApi(23)
    public static class C0250a {
        /* JADX INFO: renamed from: a */
        public static IconCompat m1314a(@NonNull Object obj) {
            tf80.m188658e(obj);
            int iM1317d = m1317d(obj);
            if (iM1317d == 2) {
                return IconCompat.m1298l(null, m1316c(obj), m1315b(obj));
            }
            if (iM1317d == 4) {
                return IconCompat.m1295i(m1318e(obj));
            }
            if (iM1317d == 6) {
                return IconCompat.m1292f(m1318e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1454b = obj;
            return iconCompat;
        }

        @DrawableRes
        @IdRes
        /* JADX INFO: renamed from: b */
        public static int m1315b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0252c.m1322a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static String m1316c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0252c.m1323b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public static int m1317d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0252c.m1324c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Uri m1318e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0252c.m1325d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Drawable m1319f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static Icon m1320g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f1453a) {
                case -1:
                    return (Icon) iconCompat.f1454b;
                case 0:
                default:
                    ig3.m135964a("Unknown type");
                    return null;
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1454b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m1304o(), iconCompat.f1457e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1454b, iconCompat.f1457e, iconCompat.f1458f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1454b);
                    break;
                case 5:
                    int i = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f1454b;
                    iconCreateWithBitmap = i < 26 ? Icon.createWithBitmap(IconCompat.m1291e((Bitmap) obj, false)) : C0251b.m1321a((Bitmap) obj);
                    break;
                case 6:
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        iconCreateWithBitmap = C0253d.m1326a(iconCompat.m1306r());
                    } else {
                        if (context == null) {
                            kg3.m145878a("Context is required to resolve the file uri of the icon: ", iconCompat.m1306r());
                            return null;
                        }
                        InputStream inputStreamM1307s = iconCompat.m1307s(context);
                        if (inputStreamM1307s == null) {
                            j850.m140190a("Cannot load adaptive icon from uri: ", iconCompat.m1306r());
                            return null;
                        }
                        if (i2 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m1291e(BitmapFactory.decodeStream(inputStreamM1307s), false));
                        } else {
                            iconCreateWithBitmap = C0251b.m1321a(BitmapFactory.decodeStream(inputStreamM1307s));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f1459g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1460h;
            if (mode != IconCompat.f1452k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    @RequiresApi(26)
    public static class C0251b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Icon m1321a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    @RequiresApi(28)
    public static class C0252c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m1322a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String m1323b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static int m1324c(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Uri m1325d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    @RequiresApi(30)
    public static class C0253d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Icon m1326a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f1453a = -1;
        this.f1455c = null;
        this.f1456d = null;
        this.f1457e = 0;
        this.f1458f = 0;
        this.f1459g = null;
        this.f1460h = f1452k;
        this.f1461i = null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static IconCompat m1288b(@NonNull Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f1457e = bundle.getInt("int1");
        iconCompat.f1458f = bundle.getInt("int2");
        iconCompat.f1462j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1459g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1460h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1454b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f1454b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f1454b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public static IconCompat m1289c(@NonNull Icon icon) {
        return C0250a.m1314a(icon);
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: d */
    public static IconCompat m1290d(@NonNull Icon icon) {
        if (C0250a.m1317d(icon) == 2 && C0250a.m1315b(icon) == 0) {
            return null;
        }
        return C0250a.m1314a(icon);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static Bitmap m1291e(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static IconCompat m1292f(@NonNull Uri uri) {
        w050.m200830c(uri);
        return m1293g(uri.toString());
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static IconCompat m1293g(@NonNull String str) {
        w050.m200830c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1454b = str;
        return iconCompat;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static IconCompat m1294h(@NonNull Bitmap bitmap) {
        w050.m200830c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1454b = bitmap;
        return iconCompat;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static IconCompat m1295i(@NonNull Uri uri) {
        w050.m200830c(uri);
        return m1296j(uri.toString());
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static IconCompat m1296j(@NonNull String str) {
        w050.m200830c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1454b = str;
        return iconCompat;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static IconCompat m1297k(@NonNull Context context, @DrawableRes int i) {
        w050.m200830c(context);
        return m1298l(context.getResources(), context.getPackageName(), i);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: l */
    public static IconCompat m1298l(@Nullable Resources resources, @NonNull String str, @DrawableRes int i) {
        w050.m200830c(str);
        if (i == 0) {
            ig3.m135964a("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1457e = i;
        if (resources != null) {
            try {
                iconCompat.f1454b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                ig3.m135964a("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.f1454b = str;
        }
        iconCompat.f1462j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: p */
    public static Resources m1299p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m1300z(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void m1301a(@NonNull Context context) {
        Object obj;
        int identifier;
        if (this.f1453a != 2 || (obj = this.f1454b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.f1457e == (identifier = m1299p(context, m1304o()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.f1457e = identifier;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: m */
    public Bitmap m1302m() {
        int i = this.f1453a;
        if (i == -1) {
            Object obj = this.f1454b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f1454b;
        }
        if (i == 5) {
            return m1291e((Bitmap) this.f1454b, true);
        }
        rkq0.m179764a("called getBitmap() on ", this);
        return null;
    }

    @DrawableRes
    /* JADX INFO: renamed from: n */
    public int m1303n() {
        int i = this.f1453a;
        if (i == -1) {
            return C0250a.m1315b(this.f1454b);
        }
        if (i == 2) {
            return this.f1457e;
        }
        rkq0.m179764a("called getResId() on ", this);
        return 0;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public String m1304o() {
        int i = this.f1453a;
        if (i == -1) {
            return C0250a.m1316c(this.f1454b);
        }
        if (i == 2) {
            String str = this.f1462j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1454b).split(":", -1)[0] : this.f1462j;
        }
        rkq0.m179764a("called getResPackage() on ", this);
        return null;
    }

    /* JADX INFO: renamed from: q */
    public int m1305q() {
        int i = this.f1453a;
        return i == -1 ? C0250a.m1317d(this.f1454b) : i;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Uri m1306r() {
        int i = this.f1453a;
        if (i == -1) {
            return C0250a.m1318e(this.f1454b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1454b);
        }
        rkq0.m179764a("called getUri() on ", this);
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: s */
    public InputStream m1307s(@NonNull Context context) {
        Uri uriM1306r = m1306r();
        String scheme = uriM1306r.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM1306r);
            } catch (Exception unused) {
                uriM1306r.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f1454b));
        } catch (FileNotFoundException unused2) {
            uriM1306r.toString();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public Drawable m1308t(@NonNull Context context) {
        m1301a(context);
        return C0250a.m1319f(m1313y(context), context);
    }

    @NonNull
    public String toString() {
        if (this.f1453a == -1) {
            return String.valueOf(this.f1454b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1300z(this.f1453a));
        switch (this.f1453a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1454b).getWidth());
                sb.append(BaseSei.f13930X);
                sb.append(((Bitmap) this.f1454b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1462j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1303n())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1457e);
                if (this.f1458f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1458f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1454b);
                break;
        }
        if (this.f1459g != null) {
            sb.append(" tint=");
            sb.append(this.f1459g);
        }
        if (this.f1460h != f1452k) {
            sb.append(" mode=");
            sb.append(this.f1460h);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m1309u() {
        this.f1460h = PorterDuff.Mode.valueOf(this.f1461i);
        switch (this.f1453a) {
            case -1:
                Parcelable parcelable = this.f1456d;
                if (parcelable == null) {
                    ig3.m135964a("Invalid icon");
                } else {
                    this.f1454b = parcelable;
                }
                break;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1456d;
                if (parcelable2 == null) {
                    byte[] bArr = this.f1455c;
                    this.f1454b = bArr;
                    this.f1453a = 3;
                    this.f1457e = 0;
                    this.f1458f = bArr.length;
                } else {
                    this.f1454b = parcelable2;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1455c, Charset.forName("UTF-16"));
                this.f1454b = str;
                if (this.f1453a == 2 && this.f1462j == null) {
                    this.f1462j = str.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                this.f1454b = this.f1455c;
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1310v(boolean z) {
        this.f1461i = this.f1460h.name();
        switch (this.f1453a) {
            case -1:
                if (!z) {
                    this.f1456d = (Parcelable) this.f1454b;
                } else {
                    ig3.m135964a("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                Object obj = this.f1454b;
                if (!z) {
                    this.f1456d = (Parcelable) obj;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1455c = byteArrayOutputStream.toByteArray();
                }
                break;
            case 2:
                this.f1455c = ((String) this.f1454b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                this.f1455c = (byte[]) this.f1454b;
                break;
            case 4:
            case 6:
                this.f1455c = this.f1454b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public Bundle m1311w() {
        Bundle bundle = new Bundle();
        switch (this.f1453a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f1454b);
                break;
            case 0:
            default:
                ig3.m135964a("Invalid icon");
                return null;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f1454b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f1454b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f1454b);
                break;
        }
        bundle.putInt("type", this.f1453a);
        bundle.putInt("int1", this.f1457e);
        bundle.putInt("int2", this.f1458f);
        bundle.putString("string1", this.f1462j);
        ColorStateList colorStateList = this.f1459g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1460h;
        if (mode != f1452k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    /* JADX INFO: renamed from: x */
    public Icon m1312x() {
        return m1313y(null);
    }

    @NonNull
    @RequiresApi(23)
    /* JADX INFO: renamed from: y */
    public Icon m1313y(@Nullable Context context) {
        return C0250a.m1320g(this, context);
    }

    public IconCompat(int i) {
        this.f1455c = null;
        this.f1456d = null;
        this.f1457e = 0;
        this.f1458f = 0;
        this.f1459g = null;
        this.f1460h = f1452k;
        this.f1461i = null;
        this.f1453a = i;
    }
}
