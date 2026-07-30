package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CardSwipeConfig;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.ugc.TXRecordCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class vo0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: e */
    public static long f184958e = 1;

    /* JADX INFO: renamed from: f */
    public static long f184959f = 280;

    /* JADX INFO: renamed from: g */
    public static long f184960g = 280;

    /* JADX INFO: renamed from: h */
    public static long f184961h = 280;

    /* JADX INFO: renamed from: i */
    public static long f184962i = 480;

    /* JADX INFO: renamed from: j */
    public static long f184963j = 330;

    /* JADX INFO: renamed from: k */
    public static long f184964k = 180;

    /* JADX INFO: renamed from: l */
    public static long f184965l = 0;

    /* JADX INFO: renamed from: m */
    public static long f184966m = 3;

    /* JADX INFO: renamed from: n */
    public static float f184967n = 30.0f;

    /* JADX INFO: renamed from: o */
    public static float f184968o = 1.25f;

    /* JADX INFO: renamed from: p */
    public static float f184969p = 0.8f;

    /* JADX INFO: renamed from: q */
    public static float f184970q = 15.0f;

    /* JADX INFO: renamed from: r */
    public static float f184971r = 8.0f;

    /* JADX INFO: renamed from: s */
    public static float f184972s = 4000.0f;

    /* JADX INFO: renamed from: t */
    public static float f184973t = 100.0f;

    /* JADX INFO: renamed from: u */
    public static float f184974u = 100.0f;

    /* JADX INFO: renamed from: v */
    public static float f184975v = 30.0f;

    /* JADX INFO: renamed from: w */
    public static float f184976w = 4000.0f;

    /* JADX INFO: renamed from: a */
    public ox2 f184980a;

    /* JADX INFO: renamed from: c */
    public CardSwipeConfig f184982c;

    /* JADX INFO: renamed from: x */
    public static float f184977x = qa00.m175859d(350.0f);

    /* JADX INFO: renamed from: y */
    public static boolean f184978y = true;

    /* JADX INFO: renamed from: z */
    public static float f184979z = 0.6f;

    /* JADX INFO: renamed from: A */
    public static float f184943A = qa00.m175859d(8000.0f);

    /* JADX INFO: renamed from: B */
    public static float f184944B = 100.0f;

    /* JADX INFO: renamed from: C */
    public static boolean f184945C = true;

    /* JADX INFO: renamed from: D */
    public static float f184946D = 150.0f;

    /* JADX INFO: renamed from: E */
    public static float f184947E = 24000.0f;

    /* JADX INFO: renamed from: F */
    public static float f184948F = 2.0f;

    /* JADX INFO: renamed from: G */
    public static float f184949G = 0.0285f;

    /* JADX INFO: renamed from: H */
    public static float f184950H = 0.35f;

    /* JADX INFO: renamed from: I */
    public static float f184951I = 100.0f;

    /* JADX INFO: renamed from: J */
    public static boolean f184952J = false;

    /* JADX INFO: renamed from: K */
    public static long f184953K = 200;

    /* JADX INFO: renamed from: L */
    public static boolean f184954L = false;

    /* JADX INFO: renamed from: M */
    public static boolean f184955M = false;

    /* JADX INFO: renamed from: N */
    public static float f184956N = 1.2f;

    /* JADX INFO: renamed from: O */
    public static Interpolator f184957O = new InterpolatorC20871a();

    /* JADX INFO: renamed from: d */
    public String f184983d = "{\"swipe_left_male_during\":370,\"swipe_right_male_during\":370,\"swipe_up_male_during\":330,\"swipe_auto_male_during\":460,\"swipe_back_male_during\":230,\"swipe_reset_male_during\":180,\"swipe_rotation_male\":30,\"swipe_trans_y_male\":30,\"swipe_speed_factor_male\":12,\"swipe_speed_check_male\":4000,\"swipe_left_female_during\":300,\"swipe_right_female_during\":300,\"swipe_up_female_during\":330,\"swipe_auto_female_during\":460,\"swipe_back_female_during\":230,\"swipe_reset_female_during\":180,\"swipe_rotation_female\":30,\"swipe_trans_y_female\":30,\"swipe_speed_factor_female\":8,\"swipe_speed_check_female\":4000,\"swipe_item_diff_male\":120,\"swipe_out_value_male\":30,\"swipe_mine_value_male\":30,\"swipe_item_diff_female\":120,\"swipe_out_value_female\":20,\"swipe_mine_value_female\":20,\"male_swipe_auto_width\":1.45,\"female_swipe_auto_width\":1.45,\"male_swipe_auto_factor\":0.62,\"female_swipe_auto_factor\":0.8,\"male_swipe_auto_rotate\":10,\"female_swipe_auto_rotate\":15,\"could_double_click\":true,\"swipe_type_factor\":0.6,\"swipe_fix_speed\":8000,\"swipe_scale\":0.0265,\"swipe_scale_start_alpha\":0.25,\"swipe_progress_value\":120,\"config_version\":2,\"scale_opt\":true,\"scale_opt_during\":200,\"scale_use_opt_during\":false,\"scale_alpha_opt\":true,\"scale_alpha_speed\":1.2}";

    /* JADX INFO: renamed from: b */
    public List<nh4> f184981b = new ArrayList();

    /* JADX INFO: renamed from: l.vo0$a */
    public static class InterpolatorC20871a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f184984a = 1.0f;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f184984a;
            if (f2 != 1.0f) {
                return (float) (1.0d - Math.pow(1.0f - f, f2 * 2.0f));
            }
            float f3 = 1.0f - f;
            return 1.0f - (f3 * f3);
        }
    }

    public vo0(ox2 ox2Var, Context context) {
        this.f184982c = null;
        this.f184980a = ox2Var;
        try {
            this.f184982c = CardSwipeConfig.JSON_ADAPTER.parse(this.f184983d);
        } catch (Exception unused) {
        }
        f184976w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        f184977x = bnl0.m105592y0();
        f184976w = Math.min(f184976w, qa00.m175859d(f184972s));
        f184944B = bnl0.m105588w0() / 6;
        m202054i(context);
        m202048c();
    }

    /* JADX INFO: renamed from: a */
    public void m202046a(int i) {
        ListIterator<nh4> listIterator = this.f184981b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f141921o == i) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m202047b() {
        ListIterator<nh4> listIterator = this.f184981b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().m163029d()) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m202048c() {
        if (NullChecker.m82486a(this.f184982c)) {
            CardSwipeConfig cardSwipeConfig = this.f184982c;
            if (cardSwipeConfig.swipe_left_male_during == 0 || cardSwipeConfig.swipe_right_male_during == 0) {
                this.f184982c = null;
            }
        }
        if (this.f184982c == null) {
            CardSwipeConfig cardSwipeConfigNew_ = CardSwipeConfig.new_();
            this.f184982c = cardSwipeConfigNew_;
            cardSwipeConfigNew_.swipe_left_male_during = 270L;
            cardSwipeConfigNew_.swipe_right_male_during = 270L;
            cardSwipeConfigNew_.swipe_auto_male_during = 300L;
            cardSwipeConfigNew_.swipe_up_male_during = 330L;
            cardSwipeConfigNew_.swipe_back_male_during = 230L;
            cardSwipeConfigNew_.swipe_reset_male_during = 180L;
            cardSwipeConfigNew_.swipe_rotation_male = 30.0d;
            cardSwipeConfigNew_.swipe_trans_y_male = 30L;
            cardSwipeConfigNew_.swipe_speed_factor_male = 8.0d;
            cardSwipeConfigNew_.swipe_speed_check_male = 4000.0d;
            cardSwipeConfigNew_.swipe_left_female_during = 280L;
            cardSwipeConfigNew_.swipe_right_female_during = 280L;
            cardSwipeConfigNew_.swipe_auto_female_during = 300L;
            cardSwipeConfigNew_.swipe_up_female_during = 330L;
            cardSwipeConfigNew_.swipe_back_female_during = 230L;
            cardSwipeConfigNew_.swipe_reset_female_during = 180L;
            cardSwipeConfigNew_.swipe_rotation_female = 30.0d;
            cardSwipeConfigNew_.swipe_trans_y_female = 30L;
            cardSwipeConfigNew_.swipe_speed_factor_female = 8.0d;
            cardSwipeConfigNew_.swipe_speed_check_female = 4000.0d;
            cardSwipeConfigNew_.swipe_item_diff_male = 200;
            cardSwipeConfigNew_.swipe_out_value_male = 20;
            cardSwipeConfigNew_.swipe_mine_value_male = 20;
            cardSwipeConfigNew_.swipe_item_diff_female = 200;
            cardSwipeConfigNew_.swipe_out_value_female = 20;
            cardSwipeConfigNew_.swipe_mine_value_female = 20;
            cardSwipeConfigNew_.male_swipe_auto_width = 1.350000023841858d;
            cardSwipeConfigNew_.female_swipe_auto_width = 1.25d;
            cardSwipeConfigNew_.male_swipe_auto_factor = 0.41999998688697815d;
            cardSwipeConfigNew_.female_swipe_auto_factor = 0.41999998688697815d;
            cardSwipeConfigNew_.male_swipe_auto_rotate = 10.0d;
            cardSwipeConfigNew_.female_swipe_auto_rotate = 15.0d;
            cardSwipeConfigNew_.could_double_click = true;
            cardSwipeConfigNew_.swipe_type_factor = 0.6000000238418579d;
            cardSwipeConfigNew_.swipe_fix_speed = TXRecordCommon.AUDIO_SAMPLERATE_8000;
            cardSwipeConfigNew_.swipe_scale = 0.02850000001490116d;
            cardSwipeConfigNew_.swipe_scale_start_alpha = 0.30000001192092896d;
            cardSwipeConfigNew_.swipe_progress_value = 100;
            cardSwipeConfigNew_.scale_opt = false;
            cardSwipeConfigNew_.scale_opt_during = 200L;
            cardSwipeConfigNew_.scale_use_opt_during = false;
            cardSwipeConfigNew_.scale_alpha_opt = false;
            cardSwipeConfigNew_.scale_alpha_speed = 1.2000000476837158d;
        }
        CardSwipeConfig cardSwipeConfig2 = this.f184982c;
        int i = cardSwipeConfig2.config_version;
        if (i == 0) {
            cardSwipeConfig2.swipe_scale_start_alpha = 0.30000001192092896d;
            cardSwipeConfig2.swipe_progress_value = 100;
            cardSwipeConfig2.swipe_scale = 0.02850000001490116d;
        }
        if (i < 2) {
            cardSwipeConfig2.scale_opt = false;
            cardSwipeConfig2.scale_opt_during = 200L;
            cardSwipeConfig2.scale_use_opt_during = false;
            cardSwipeConfig2.scale_alpha_opt = false;
            cardSwipeConfig2.scale_alpha_speed = 1.2000000476837158d;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9) && userM116600p9.isFemale()) {
            CardSwipeConfig cardSwipeConfig3 = this.f184982c;
            f184959f = cardSwipeConfig3.swipe_left_female_during;
            f184960g = cardSwipeConfig3.swipe_right_female_during;
            f184961h = cardSwipeConfig3.swipe_up_female_during;
            f184962i = cardSwipeConfig3.swipe_auto_female_during;
            long j = cardSwipeConfig3.swipe_back_female_during;
            long j2 = f184958e;
            f184963j = j * j2;
            f184964k = cardSwipeConfig3.swipe_reset_female_during * j2;
            f184965l = qa00.m175859d(cardSwipeConfig3.swipe_trans_y_female);
            CardSwipeConfig cardSwipeConfig4 = this.f184982c;
            f184967n = (float) cardSwipeConfig4.swipe_rotation_female;
            f184971r = (float) cardSwipeConfig4.swipe_speed_factor_female;
            f184972s = (float) cardSwipeConfig4.swipe_speed_check_female;
            f184973t = qa00.m175859d(cardSwipeConfig4.swipe_item_diff_female);
            f184974u = qa00.m175859d(this.f184982c.swipe_out_value_female);
            f184975v = qa00.m175859d(this.f184982c.swipe_mine_value_female);
            CardSwipeConfig cardSwipeConfig5 = this.f184982c;
            f184968o = (float) cardSwipeConfig5.female_swipe_auto_width;
            f184969p = (float) cardSwipeConfig5.female_swipe_auto_factor;
            f184970q = (float) cardSwipeConfig5.female_swipe_auto_rotate;
            f184978y = cardSwipeConfig5.could_double_click;
            f184979z = (float) cardSwipeConfig5.swipe_type_factor;
        } else {
            CardSwipeConfig cardSwipeConfig6 = this.f184982c;
            long j3 = cardSwipeConfig6.swipe_left_male_during;
            long j4 = f184958e;
            f184959f = j3 * j4;
            f184960g = cardSwipeConfig6.swipe_right_male_during * j4;
            f184961h = cardSwipeConfig6.swipe_up_male_during * j4;
            f184962i = cardSwipeConfig6.swipe_auto_male_during * j4;
            f184963j = cardSwipeConfig6.swipe_back_male_during * j4;
            f184964k = cardSwipeConfig6.swipe_reset_male_during * j4;
            f184965l = qa00.m175859d(cardSwipeConfig6.swipe_trans_y_male);
            CardSwipeConfig cardSwipeConfig7 = this.f184982c;
            f184967n = (float) cardSwipeConfig7.swipe_rotation_male;
            f184971r = (float) cardSwipeConfig7.swipe_speed_factor_male;
            f184972s = (float) cardSwipeConfig7.swipe_speed_check_male;
            f184973t = qa00.m175859d(cardSwipeConfig7.swipe_item_diff_male);
            f184974u = qa00.m175859d(this.f184982c.swipe_out_value_male);
            f184975v = qa00.m175859d(this.f184982c.swipe_mine_value_male);
            CardSwipeConfig cardSwipeConfig8 = this.f184982c;
            f184968o = (float) cardSwipeConfig8.male_swipe_auto_width;
            f184969p = (float) cardSwipeConfig8.male_swipe_auto_factor;
            f184970q = (float) cardSwipeConfig8.male_swipe_auto_rotate;
            f184978y = cardSwipeConfig8.could_double_click;
            f184979z = (float) cardSwipeConfig8.swipe_type_factor;
        }
        f184943A = qa00.m175859d(this.f184982c.swipe_fix_speed);
        CardSwipeConfig cardSwipeConfig9 = this.f184982c;
        f184949G = (float) cardSwipeConfig9.swipe_scale;
        f184950H = (float) cardSwipeConfig9.swipe_scale_start_alpha;
        f184951I = qa00.m175859d(cardSwipeConfig9.swipe_progress_value);
        CardSwipeConfig cardSwipeConfig10 = this.f184982c;
        f184952J = cardSwipeConfig10.scale_opt;
        f184953K = cardSwipeConfig10.scale_opt_during * f184958e;
        f184954L = cardSwipeConfig10.scale_use_opt_during;
        f184955M = cardSwipeConfig10.scale_alpha_opt;
        f184956N = (float) cardSwipeConfig10.scale_alpha_speed;
    }

    /* JADX INFO: renamed from: d */
    public void m202049d(nh4... nh4VarArr) {
        if (nh4VarArr == null || nh4VarArr.length <= 0) {
            return;
        }
        for (nh4 nh4Var : nh4VarArr) {
            this.f184981b.add(nh4Var);
            this.f184980a.m169626N(nh4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (nh4 nh4Var : this.f184981b) {
            if (nh4Var.f141908b == CardAnimType.ANIM_INVALID) {
                nh4Var.f141920n = true;
            } else {
                this.f184980a.m169625K(nh4Var, jElapsedRealtime);
                boolean z2 = jElapsedRealtime >= nh4Var.f141910d + nh4Var.f141909c;
                if (z2) {
                    nh4Var.f141920n = true;
                }
                z |= !z2;
            }
        }
        Iterator<nh4> it = this.f184981b.iterator();
        while (it.hasNext()) {
            nh4 next = it.next();
            if (next.f141920n) {
                if (BifrostLayout.f24063d) {
                    Objects.toString(next.f141908b);
                }
                it.remove();
                this.f184980a.m169624I(next, jElapsedRealtime);
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m202050e(List<nh4> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (nh4 nh4Var : list) {
            this.f184981b.add(nh4Var);
            this.f184980a.m169626N(nh4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        doFrame(System.nanoTime());
    }

    /* JADX INFO: renamed from: f */
    public boolean m202051f() {
        ListIterator<nh4> listIterator = this.f184981b.listIterator();
        while (listIterator.hasNext()) {
            nh4 next = listIterator.next();
            if (next.f141908b == CardAnimType.ANIM_INSERT && next.f141913g == CardSwipeOutState.INVALID) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m202052g() {
        ListIterator<nh4> listIterator = this.f184981b.listIterator();
        while (listIterator.hasNext()) {
            nh4 next = listIterator.next();
            if (next.f141908b == CardAnimType.ANIM_OUT && (next.f141913g == CardSwipeOutState.INVALID || !next.f141916j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m202053h(int i) {
        if (BifrostLayout.f24063d) {
            this.f184981b.isEmpty();
            this.f184981b.size();
        }
        for (nh4 nh4Var : this.f184981b) {
            if (BifrostLayout.f24063d) {
                Objects.toString(nh4Var.f141919m.toArray()[0]);
            }
            if (nh4Var.m163038m(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m202054i(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f184946D = viewConfiguration.getScaledMinimumFlingVelocity();
        f184947E = viewConfiguration.getScaledMaximumFlingVelocity();
        String str = BifrostLayout.f24062c;
    }
}
