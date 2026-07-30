package p149l;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mpw {

    /* JADX INFO: renamed from: a */
    public String f135091a;

    /* JADX INFO: renamed from: b */
    public String f135092b;

    /* JADX INFO: renamed from: c */
    public long f135093c;

    /* JADX INFO: renamed from: d */
    public long f135094d;

    /* JADX INFO: renamed from: e */
    public long f135095e;

    /* JADX INFO: renamed from: f */
    public List<C18528a> f135096f;

    /* JADX INFO: renamed from: g */
    public boolean f135097g;

    /* JADX INFO: renamed from: h */
    public List<C18530c> f135098h;

    /* JADX INFO: renamed from: i */
    public List<BLiveGuardboardRecord> f135099i;

    /* JADX INFO: renamed from: j */
    public boolean f135100j;

    /* JADX INFO: renamed from: k */
    public String f135101k;

    /* JADX INFO: renamed from: l */
    public boolean f135102l;

    /* JADX INFO: renamed from: m */
    public String f135103m;

    /* JADX INFO: renamed from: l.mpw$a */
    public static class C18528a {

        /* JADX INFO: renamed from: a */
        public BLiveGuardType f135104a;

        /* JADX INFO: renamed from: b */
        public String f135105b;

        /* JADX INFO: renamed from: c */
        public String f135106c;

        /* JADX INFO: renamed from: d */
        public String f135107d;

        /* JADX INFO: renamed from: e */
        public String f135108e;

        /* JADX INFO: renamed from: f */
        public boolean f135109f;

        /* JADX INFO: renamed from: g */
        public int f135110g;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f135111h;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f135112i;

        /* JADX INFO: renamed from: j */
        public List<C18529b> f135113j;

        /* JADX INFO: renamed from: k */
        public int f135114k;

        /* JADX INFO: renamed from: l */
        @DrawableRes
        public int f135115l;

        /* JADX INFO: renamed from: m */
        @DrawableRes
        public int f135116m;

        /* JADX INFO: renamed from: n */
        @ColorInt
        public int f135117n;

        /* JADX INFO: renamed from: o */
        @ColorInt
        public int f135118o;

        /* JADX INFO: renamed from: p */
        @DrawableRes
        public int f135119p;

        /* JADX INFO: renamed from: q */
        public String f135120q;

        /* JADX INFO: renamed from: r */
        public String f135121r;

        /* JADX INFO: renamed from: s */
        public String f135122s;

        /* JADX INFO: renamed from: t */
        public String f135123t;

        /* JADX INFO: renamed from: u */
        public String f135124u;

        /* JADX INFO: renamed from: a */
        public static boolean m155838a(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, BLiveGuardType.cherish);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m155839b(BLiveGuardType bLiveGuardType) {
            return TEnum.equals(bLiveGuardType, "heartbeat");
        }
    }

    /* JADX INFO: renamed from: l.mpw$b */
    public static class C18529b {

        /* JADX INFO: renamed from: a */
        public String f135125a;

        /* JADX INFO: renamed from: b */
        public String f135126b;

        /* JADX INFO: renamed from: c */
        public String f135127c;

        /* JADX INFO: renamed from: d */
        public int f135128d;

        public C18529b(String str, String str2, int i) {
            this.f135125a = str;
            this.f135127c = str2;
            this.f135128d = i;
        }
    }

    /* JADX INFO: renamed from: l.mpw$c */
    public static class C18530c {

        /* JADX INFO: renamed from: a */
        public String f135129a;

        /* JADX INFO: renamed from: b */
        public String f135130b;

        public C18530c(String str, String str2) {
            this.f135129a = str;
            this.f135130b = str2;
        }
    }
}
