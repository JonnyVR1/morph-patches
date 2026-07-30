package p153l;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lsw {

    /* JADX INFO: renamed from: a */
    public String f133467a;

    /* JADX INFO: renamed from: b */
    public String f133468b;

    /* JADX INFO: renamed from: c */
    public long f133469c;

    /* JADX INFO: renamed from: d */
    public long f133470d;

    /* JADX INFO: renamed from: e */
    public long f133471e;

    /* JADX INFO: renamed from: f */
    public List<C18451a> f133472f;

    /* JADX INFO: renamed from: g */
    public boolean f133473g;

    /* JADX INFO: renamed from: h */
    public List<C18453c> f133474h;

    /* JADX INFO: renamed from: i */
    public List<BLiveGuardboardRecord> f133475i;

    /* JADX INFO: renamed from: j */
    public boolean f133476j;

    /* JADX INFO: renamed from: k */
    public String f133477k;

    /* JADX INFO: renamed from: l */
    public boolean f133478l;

    /* JADX INFO: renamed from: m */
    public String f133479m;

    /* JADX INFO: renamed from: l.lsw$a */
    public static class C18451a {

        /* JADX INFO: renamed from: a */
        public BLiveGuardType f133480a;

        /* JADX INFO: renamed from: b */
        public String f133481b;

        /* JADX INFO: renamed from: c */
        public String f133482c;

        /* JADX INFO: renamed from: d */
        public String f133483d;

        /* JADX INFO: renamed from: e */
        public String f133484e;

        /* JADX INFO: renamed from: f */
        public boolean f133485f;

        /* JADX INFO: renamed from: g */
        public int f133486g;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f133487h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f133488i;

        /* JADX INFO: renamed from: j */
        public List<C18452b> f133489j;

        /* JADX INFO: renamed from: k */
        public int f133490k;

        /* JADX INFO: renamed from: l */
        @DrawableRes
        public int f133491l;

        /* JADX INFO: renamed from: m */
        @DrawableRes
        public int f133492m;

        /* JADX INFO: renamed from: n */
        @ColorInt
        public int f133493n;

        /* JADX INFO: renamed from: o */
        @ColorInt
        public int f133494o;

        /* JADX INFO: renamed from: p */
        @DrawableRes
        public int f133495p;

        /* JADX INFO: renamed from: q */
        public String f133496q;

        /* JADX INFO: renamed from: r */
        public String f133497r;

        /* JADX INFO: renamed from: s */
        public String f133498s;

        /* JADX INFO: renamed from: t */
        public String f133499t;

        /* JADX INFO: renamed from: u */
        public String f133500u;

        /* JADX INFO: renamed from: a */
        public static boolean m155733a(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, BLiveGuardType.cherish);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m155734b(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, "heartbeat");
        }
    }

    /* JADX INFO: renamed from: l.lsw$b */
    public static class C18452b {

        /* JADX INFO: renamed from: a */
        public String f133501a;

        /* JADX INFO: renamed from: b */
        public String f133502b;

        /* JADX INFO: renamed from: c */
        public String f133503c;

        /* JADX INFO: renamed from: d */
        public int f133504d;

        public C18452b(String str, String str2, int i) {
            this.f133501a = str;
            this.f133503c = str2;
            this.f133504d = i;
        }
    }

    /* JADX INFO: renamed from: l.lsw$c */
    public static class C18453c {

        /* JADX INFO: renamed from: a */
        public String f133505a;

        /* JADX INFO: renamed from: b */
        public String f133506b;

        public C18453c(String str, String str2) {
            this.f133505a = str;
            this.f133506b = str2;
        }
    }
}
