package p009l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CardSwipeConfig;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zo0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: e */
    public static long f23776e = 1;

    /* JADX INFO: renamed from: f */
    public static long f23777f = 280;

    /* JADX INFO: renamed from: g */
    public static long f23778g = 280;

    /* JADX INFO: renamed from: h */
    public static long f23779h = 280;

    /* JADX INFO: renamed from: i */
    public static long f23780i = 480;

    /* JADX INFO: renamed from: j */
    public static long f23781j = 330;

    /* JADX INFO: renamed from: k */
    public static long f23782k = 180;

    /* JADX INFO: renamed from: l */
    public static long f23783l = 0;

    /* JADX INFO: renamed from: m */
    public static long f23784m = 3;

    /* JADX INFO: renamed from: n */
    public static float f23785n = 30.0f;

    /* JADX INFO: renamed from: o */
    public static float f23786o = 1.25f;

    /* JADX INFO: renamed from: p */
    public static float f23787p = 0.8f;

    /* JADX INFO: renamed from: q */
    public static float f23788q = 15.0f;

    /* JADX INFO: renamed from: r */
    public static float f23789r = 8.0f;

    /* JADX INFO: renamed from: s */
    public static float f23790s = 4000.0f;

    /* JADX INFO: renamed from: t */
    public static float f23791t = 100.0f;

    /* JADX INFO: renamed from: u */
    public static float f23792u = 100.0f;

    /* JADX INFO: renamed from: v */
    public static float f23793v = 30.0f;

    /* JADX INFO: renamed from: w */
    public static float f23794w = 4000.0f;

    /* JADX INFO: renamed from: a */
    public zw2 f23798a;

    /* JADX INFO: renamed from: c */
    public CardSwipeConfig f23800c;

    /* JADX INFO: renamed from: x */
    public static float f23795x = t100.d(350.0f);

    /* JADX INFO: renamed from: y */
    public static boolean f23796y = true;

    /* JADX INFO: renamed from: z */
    public static float f23797z = 0.6f;

    /* JADX INFO: renamed from: A */
    public static float f23761A = t100.d(8000.0f);

    /* JADX INFO: renamed from: B */
    public static float f23762B = 100.0f;

    /* JADX INFO: renamed from: C */
    public static boolean f23763C = true;

    /* JADX INFO: renamed from: D */
    public static float f23764D = 150.0f;

    /* JADX INFO: renamed from: E */
    public static float f23765E = 24000.0f;

    /* JADX INFO: renamed from: F */
    public static float f23766F = 2.0f;

    /* JADX INFO: renamed from: G */
    public static float f23767G = 0.0285f;

    /* JADX INFO: renamed from: H */
    public static float f23768H = 0.35f;

    /* JADX INFO: renamed from: I */
    public static float f23769I = 100.0f;

    /* JADX INFO: renamed from: J */
    public static boolean f23770J = false;

    /* JADX INFO: renamed from: K */
    public static long f23771K = 200;

    /* JADX INFO: renamed from: L */
    public static boolean f23772L = false;

    /* JADX INFO: renamed from: M */
    public static boolean f23773M = false;

    /* JADX INFO: renamed from: N */
    public static float f23774N = 1.2f;

    /* JADX INFO: renamed from: O */
    public static Interpolator f23775O = new InterpolatorC1371a();

    /* JADX INFO: renamed from: d */
    public String f23801d = "{\"swipe_left_male_during\":370,\"swipe_right_male_during\":370,\"swipe_up_male_during\":330,\"swipe_auto_male_during\":460,\"swipe_back_male_during\":230,\"swipe_reset_male_during\":180,\"swipe_rotation_male\":30,\"swipe_trans_y_male\":30,\"swipe_speed_factor_male\":12,\"swipe_speed_check_male\":4000,\"swipe_left_female_during\":300,\"swipe_right_female_during\":300,\"swipe_up_female_during\":330,\"swipe_auto_female_during\":460,\"swipe_back_female_during\":230,\"swipe_reset_female_during\":180,\"swipe_rotation_female\":30,\"swipe_trans_y_female\":30,\"swipe_speed_factor_female\":8,\"swipe_speed_check_female\":4000,\"swipe_item_diff_male\":120,\"swipe_out_value_male\":30,\"swipe_mine_value_male\":30,\"swipe_item_diff_female\":120,\"swipe_out_value_female\":20,\"swipe_mine_value_female\":20,\"male_swipe_auto_width\":1.45,\"female_swipe_auto_width\":1.45,\"male_swipe_auto_factor\":0.62,\"female_swipe_auto_factor\":0.8,\"male_swipe_auto_rotate\":10,\"female_swipe_auto_rotate\":15,\"could_double_click\":true,\"swipe_type_factor\":0.6,\"swipe_fix_speed\":8000,\"swipe_scale\":0.0265,\"swipe_scale_start_alpha\":0.25,\"swipe_progress_value\":120,\"config_version\":2,\"scale_opt\":true,\"scale_opt_during\":200,\"scale_use_opt_during\":false,\"scale_alpha_opt\":true,\"scale_alpha_speed\":1.2}";

    /* JADX INFO: renamed from: b */
    public List<og4> f23799b = new ArrayList();

    /* JADX INFO: renamed from: l.zo0$a */
    public static class InterpolatorC1371a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f23802a = 1.0f;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f23802a;
            if (f2 != 1.0f) {
                return (float) (1.0d - Math.pow(1.0f - f, f2 * 2.0f));
            }
            float f3 = 1.0f - f;
            return 1.0f - (f3 * f3);
        }
    }

    public zo0(zw2 zw2Var, Context context) {
        this.f23800c = null;
        this.f23798a = zw2Var;
        try {
            this.f23800c = (CardSwipeConfig) CardSwipeConfig.JSON_ADAPTER.parse(this.f23801d);
        } catch (Exception unused) {
        }
        f23794w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        f23795x = xdl0.y0();
        f23794w = Math.min(f23794w, t100.d(f23790s));
        f23762B = xdl0.w0() / 6;
        m25887i(context);
        m25881c();
    }

    /* JADX INFO: renamed from: a */
    public void m25879a(int i) {
        ListIterator<og4> listIterator = this.f23799b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f18020o == i) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25880b() {
        ListIterator<og4> listIterator = this.f23799b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().m19742d()) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25881c() {
        if (NullChecker.a(this.f23800c)) {
            CardSwipeConfig cardSwipeConfig = this.f23800c;
            if (cardSwipeConfig.swipe_left_male_during == 0 || cardSwipeConfig.swipe_right_male_during == 0) {
                this.f23800c = null;
            }
        }
        if (this.f23800c == null) {
            CardSwipeConfig cardSwipeConfigNew_ = CardSwipeConfig.new_();
            this.f23800c = cardSwipeConfigNew_;
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
            cardSwipeConfigNew_.swipe_fix_speed = 8000;
            cardSwipeConfigNew_.swipe_scale = 0.02850000001490116d;
            cardSwipeConfigNew_.swipe_scale_start_alpha = 0.30000001192092896d;
            cardSwipeConfigNew_.swipe_progress_value = 100;
            cardSwipeConfigNew_.scale_opt = false;
            cardSwipeConfigNew_.scale_opt_during = 200L;
            cardSwipeConfigNew_.scale_use_opt_during = false;
            cardSwipeConfigNew_.scale_alpha_opt = false;
            cardSwipeConfigNew_.scale_alpha_speed = 1.2000000476837158d;
        }
        CardSwipeConfig cardSwipeConfig2 = this.f23800c;
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
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9) && userP9.isFemale()) {
            CardSwipeConfig cardSwipeConfig3 = this.f23800c;
            f23777f = cardSwipeConfig3.swipe_left_female_during;
            f23778g = cardSwipeConfig3.swipe_right_female_during;
            f23779h = cardSwipeConfig3.swipe_up_female_during;
            f23780i = cardSwipeConfig3.swipe_auto_female_during;
            long j = cardSwipeConfig3.swipe_back_female_during;
            long j2 = f23776e;
            f23781j = j * j2;
            f23782k = cardSwipeConfig3.swipe_reset_female_during * j2;
            f23783l = t100.d(cardSwipeConfig3.swipe_trans_y_female);
            CardSwipeConfig cardSwipeConfig4 = this.f23800c;
            f23785n = (float) cardSwipeConfig4.swipe_rotation_female;
            f23789r = (float) cardSwipeConfig4.swipe_speed_factor_female;
            f23790s = (float) cardSwipeConfig4.swipe_speed_check_female;
            f23791t = t100.d(cardSwipeConfig4.swipe_item_diff_female);
            f23792u = t100.d(this.f23800c.swipe_out_value_female);
            f23793v = t100.d(this.f23800c.swipe_mine_value_female);
            CardSwipeConfig cardSwipeConfig5 = this.f23800c;
            f23786o = (float) cardSwipeConfig5.female_swipe_auto_width;
            f23787p = (float) cardSwipeConfig5.female_swipe_auto_factor;
            f23788q = (float) cardSwipeConfig5.female_swipe_auto_rotate;
            f23796y = cardSwipeConfig5.could_double_click;
            f23797z = (float) cardSwipeConfig5.swipe_type_factor;
        } else {
            CardSwipeConfig cardSwipeConfig6 = this.f23800c;
            long j3 = cardSwipeConfig6.swipe_left_male_during;
            long j4 = f23776e;
            f23777f = j3 * j4;
            f23778g = cardSwipeConfig6.swipe_right_male_during * j4;
            f23779h = cardSwipeConfig6.swipe_up_male_during * j4;
            f23780i = cardSwipeConfig6.swipe_auto_male_during * j4;
            f23781j = cardSwipeConfig6.swipe_back_male_during * j4;
            f23782k = cardSwipeConfig6.swipe_reset_male_during * j4;
            f23783l = t100.d(cardSwipeConfig6.swipe_trans_y_male);
            CardSwipeConfig cardSwipeConfig7 = this.f23800c;
            f23785n = (float) cardSwipeConfig7.swipe_rotation_male;
            f23789r = (float) cardSwipeConfig7.swipe_speed_factor_male;
            f23790s = (float) cardSwipeConfig7.swipe_speed_check_male;
            f23791t = t100.d(cardSwipeConfig7.swipe_item_diff_male);
            f23792u = t100.d(this.f23800c.swipe_out_value_male);
            f23793v = t100.d(this.f23800c.swipe_mine_value_male);
            CardSwipeConfig cardSwipeConfig8 = this.f23800c;
            f23786o = (float) cardSwipeConfig8.male_swipe_auto_width;
            f23787p = (float) cardSwipeConfig8.male_swipe_auto_factor;
            f23788q = (float) cardSwipeConfig8.male_swipe_auto_rotate;
            f23796y = cardSwipeConfig8.could_double_click;
            f23797z = (float) cardSwipeConfig8.swipe_type_factor;
        }
        f23761A = t100.d(this.f23800c.swipe_fix_speed);
        CardSwipeConfig cardSwipeConfig9 = this.f23800c;
        f23767G = (float) cardSwipeConfig9.swipe_scale;
        f23768H = (float) cardSwipeConfig9.swipe_scale_start_alpha;
        f23769I = t100.d(cardSwipeConfig9.swipe_progress_value);
        CardSwipeConfig cardSwipeConfig10 = this.f23800c;
        f23770J = cardSwipeConfig10.scale_opt;
        f23771K = cardSwipeConfig10.scale_opt_during * f23776e;
        f23772L = cardSwipeConfig10.scale_use_opt_during;
        f23773M = cardSwipeConfig10.scale_alpha_opt;
        f23774N = (float) cardSwipeConfig10.scale_alpha_speed;
    }

    /* JADX INFO: renamed from: d */
    public void m25882d(og4... og4VarArr) {
        if (og4VarArr == null || og4VarArr.length <= 0) {
            return;
        }
        for (og4 og4Var : og4VarArr) {
            this.f23799b.add(og4Var);
            this.f23798a.m25995N(og4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (og4 og4Var : this.f23799b) {
            if (og4Var.f18007b == CardAnimType.ANIM_INVALID) {
                og4Var.f18019n = true;
            } else {
                this.f23798a.m25994K(og4Var, jElapsedRealtime);
                boolean z2 = jElapsedRealtime >= og4Var.f18009d + og4Var.f18008c;
                if (z2) {
                    og4Var.f18019n = true;
                }
                z |= !z2;
            }
        }
        Iterator<og4> it = this.f23799b.iterator();
        while (it.hasNext()) {
            og4 next = it.next();
            if (next.f18019n) {
                if (BifrostLayout.f2099d) {
                    Objects.toString(next.f18007b);
                }
                it.remove();
                this.f23798a.m25993I(next, jElapsedRealtime);
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m25883e(List<og4> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (og4 og4Var : list) {
            this.f23799b.add(og4Var);
            this.f23798a.m25995N(og4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        doFrame(System.nanoTime());
    }

    /* JADX INFO: renamed from: f */
    public boolean m25884f() {
        ListIterator<og4> listIterator = this.f23799b.listIterator();
        while (listIterator.hasNext()) {
            og4 next = listIterator.next();
            if (next.f18007b == CardAnimType.ANIM_INSERT && next.f18012g == CardSwipeOutState.INVALID) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25885g() {
        ListIterator<og4> listIterator = this.f23799b.listIterator();
        while (listIterator.hasNext()) {
            og4 next = listIterator.next();
            if (next.f18007b == CardAnimType.ANIM_OUT && (next.f18012g == CardSwipeOutState.INVALID || !next.f18015j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m25886h(int i) {
        if (BifrostLayout.f2099d) {
            this.f23799b.isEmpty();
            this.f23799b.size();
        }
        for (og4 og4Var : this.f23799b) {
            if (BifrostLayout.f2099d) {
                Objects.toString(og4Var.f18018m.toArray()[0]);
            }
            if (og4Var.m19751m(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m25887i(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f23764D = viewConfiguration.getScaledMinimumFlingVelocity();
        f23765E = viewConfiguration.getScaledMaximumFlingVelocity();
        String str = BifrostLayout.f2098c;
    }
}
