package p002l;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mpw {

    /* JADX INFO: renamed from: a */
    public String f15519a;

    /* JADX INFO: renamed from: b */
    public String f15520b;

    /* JADX INFO: renamed from: c */
    public long f15521c;

    /* JADX INFO: renamed from: d */
    public long f15522d;

    /* JADX INFO: renamed from: e */
    public long f15523e;

    /* JADX INFO: renamed from: f */
    public List<C0681a> f15524f;

    /* JADX INFO: renamed from: g */
    public boolean f15525g;

    /* JADX INFO: renamed from: h */
    public List<C0683c> f15526h;

    /* JADX INFO: renamed from: i */
    public List<BLiveGuardboardRecord> f15527i;

    /* JADX INFO: renamed from: j */
    public boolean f15528j;

    /* JADX INFO: renamed from: k */
    public String f15529k;

    /* JADX INFO: renamed from: l */
    public boolean f15530l;

    /* JADX INFO: renamed from: m */
    public String f15531m;

    /* JADX INFO: renamed from: l.mpw$a */
    public static class C0681a {

        /* JADX INFO: renamed from: a */
        public BLiveGuardType f15532a;

        /* JADX INFO: renamed from: b */
        public String f15533b;

        /* JADX INFO: renamed from: c */
        public String f15534c;

        /* JADX INFO: renamed from: d */
        public String f15535d;

        /* JADX INFO: renamed from: e */
        public String f15536e;

        /* JADX INFO: renamed from: f */
        public boolean f15537f;

        /* JADX INFO: renamed from: g */
        public int f15538g;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f15539h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f15540i;

        /* JADX INFO: renamed from: j */
        public List<C0682b> f15541j;

        /* JADX INFO: renamed from: k */
        public int f15542k;

        /* JADX INFO: renamed from: l */
        @DrawableRes
        public int f15543l;

        /* JADX INFO: renamed from: m */
        @DrawableRes
        public int f15544m;

        /* JADX INFO: renamed from: n */
        @ColorInt
        public int f15545n;

        /* JADX INFO: renamed from: o */
        @ColorInt
        public int f15546o;

        /* JADX INFO: renamed from: p */
        @DrawableRes
        public int f15547p;

        /* JADX INFO: renamed from: q */
        public String f15548q;

        /* JADX INFO: renamed from: r */
        public String f15549r;

        /* JADX INFO: renamed from: s */
        public String f15550s;

        /* JADX INFO: renamed from: t */
        public String f15551t;

        /* JADX INFO: renamed from: u */
        public String f15552u;

        /* JADX INFO: renamed from: a */
        public static boolean m18129a(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, "cherish");
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18130b(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, "heartbeat");
        }
    }

    /* JADX INFO: renamed from: l.mpw$b */
    public static class C0682b {

        /* JADX INFO: renamed from: a */
        public String f15553a;

        /* JADX INFO: renamed from: b */
        public String f15554b;

        /* JADX INFO: renamed from: c */
        public String f15555c;

        /* JADX INFO: renamed from: d */
        public int f15556d;

        public C0682b(String str, String str2, int i) {
            this.f15553a = str;
            this.f15555c = str2;
            this.f15556d = i;
        }
    }

    /* JADX INFO: renamed from: l.mpw$c */
    public static class C0683c {

        /* JADX INFO: renamed from: a */
        public String f15557a;

        /* JADX INFO: renamed from: b */
        public String f15558b;

        public C0683c(String str, String str2) {
            this.f15557a = str;
            this.f15558b = str2;
        }
    }
}
