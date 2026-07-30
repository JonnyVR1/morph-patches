package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CardSwipeConfig;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.ugc.TXRecordCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class zo0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: e */
    public static long f204052e = 1;

    /* JADX INFO: renamed from: f */
    public static long f204053f = 280;

    /* JADX INFO: renamed from: g */
    public static long f204054g = 280;

    /* JADX INFO: renamed from: h */
    public static long f204055h = 280;

    /* JADX INFO: renamed from: i */
    public static long f204056i = 480;

    /* JADX INFO: renamed from: j */
    public static long f204057j = 330;

    /* JADX INFO: renamed from: k */
    public static long f204058k = 180;

    /* JADX INFO: renamed from: l */
    public static long f204059l = 0;

    /* JADX INFO: renamed from: m */
    public static long f204060m = 3;

    /* JADX INFO: renamed from: n */
    public static float f204061n = 30.0f;

    /* JADX INFO: renamed from: o */
    public static float f204062o = 1.25f;

    /* JADX INFO: renamed from: p */
    public static float f204063p = 0.8f;

    /* JADX INFO: renamed from: q */
    public static float f204064q = 15.0f;

    /* JADX INFO: renamed from: r */
    public static float f204065r = 8.0f;

    /* JADX INFO: renamed from: s */
    public static float f204066s = 4000.0f;

    /* JADX INFO: renamed from: t */
    public static float f204067t = 100.0f;

    /* JADX INFO: renamed from: u */
    public static float f204068u = 100.0f;

    /* JADX INFO: renamed from: v */
    public static float f204069v = 30.0f;

    /* JADX INFO: renamed from: w */
    public static float f204070w = 4000.0f;

    /* JADX INFO: renamed from: a */
    public zw2 f204074a;

    /* JADX INFO: renamed from: c */
    public CardSwipeConfig f204076c;

    /* JADX INFO: renamed from: x */
    public static float f204071x = t100.m186890d(350.0f);

    /* JADX INFO: renamed from: y */
    public static boolean f204072y = true;

    /* JADX INFO: renamed from: z */
    public static float f204073z = 0.6f;

    /* JADX INFO: renamed from: A */
    public static float f204037A = t100.m186890d(8000.0f);

    /* JADX INFO: renamed from: B */
    public static float f204038B = 100.0f;

    /* JADX INFO: renamed from: C */
    public static boolean f204039C = true;

    /* JADX INFO: renamed from: D */
    public static float f204040D = 150.0f;

    /* JADX INFO: renamed from: E */
    public static float f204041E = 24000.0f;

    /* JADX INFO: renamed from: F */
    public static float f204042F = 2.0f;

    /* JADX INFO: renamed from: G */
    public static float f204043G = 0.0285f;

    /* JADX INFO: renamed from: H */
    public static float f204044H = 0.35f;

    /* JADX INFO: renamed from: I */
    public static float f204045I = 100.0f;

    /* JADX INFO: renamed from: J */
    public static boolean f204046J = false;

    /* JADX INFO: renamed from: K */
    public static long f204047K = 200;

    /* JADX INFO: renamed from: L */
    public static boolean f204048L = false;

    /* JADX INFO: renamed from: M */
    public static boolean f204049M = false;

    /* JADX INFO: renamed from: N */
    public static float f204050N = 1.2f;

    /* JADX INFO: renamed from: O */
    public static Interpolator f204051O = new InterpolatorC21740a();

    /* JADX INFO: renamed from: d */
    public String f204077d = "{\"swipe_left_male_during\":370,\"swipe_right_male_during\":370,\"swipe_up_male_during\":330,\"swipe_auto_male_during\":460,\"swipe_back_male_during\":230,\"swipe_reset_male_during\":180,\"swipe_rotation_male\":30,\"swipe_trans_y_male\":30,\"swipe_speed_factor_male\":12,\"swipe_speed_check_male\":4000,\"swipe_left_female_during\":300,\"swipe_right_female_during\":300,\"swipe_up_female_during\":330,\"swipe_auto_female_during\":460,\"swipe_back_female_during\":230,\"swipe_reset_female_during\":180,\"swipe_rotation_female\":30,\"swipe_trans_y_female\":30,\"swipe_speed_factor_female\":8,\"swipe_speed_check_female\":4000,\"swipe_item_diff_male\":120,\"swipe_out_value_male\":30,\"swipe_mine_value_male\":30,\"swipe_item_diff_female\":120,\"swipe_out_value_female\":20,\"swipe_mine_value_female\":20,\"male_swipe_auto_width\":1.45,\"female_swipe_auto_width\":1.45,\"male_swipe_auto_factor\":0.62,\"female_swipe_auto_factor\":0.8,\"male_swipe_auto_rotate\":10,\"female_swipe_auto_rotate\":15,\"could_double_click\":true,\"swipe_type_factor\":0.6,\"swipe_fix_speed\":8000,\"swipe_scale\":0.0265,\"swipe_scale_start_alpha\":0.25,\"swipe_progress_value\":120,\"config_version\":2,\"scale_opt\":true,\"scale_opt_during\":200,\"scale_use_opt_during\":false,\"scale_alpha_opt\":true,\"scale_alpha_speed\":1.2}";

    /* JADX INFO: renamed from: b */
    public List<og4> f204075b = new ArrayList();

    /* JADX INFO: renamed from: l.zo0$a */
    public static class InterpolatorC21740a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f204078a = 1.0f;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f204078a;
            if (f2 != 1.0f) {
                return (float) (1.0d - Math.pow(1.0f - f, f2 * 2.0f));
            }
            float f3 = 1.0f - f;
            return 1.0f - (f3 * f3);
        }
    }

    public zo0(zw2 zw2Var, Context context) {
        this.f204076c = null;
        this.f204074a = zw2Var;
        try {
            this.f204076c = CardSwipeConfig.JSON_ADAPTER.parse(this.f204077d);
        } catch (Exception unused) {
        }
        f204070w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        f204071x = xdl0.m208412y0();
        f204070w = Math.min(f204070w, t100.m186890d(f204066s));
        f204038B = xdl0.m208408w0() / 6;
        m219543i(context);
        m219537c();
    }

    /* JADX INFO: renamed from: a */
    public void m219535a(int i) {
        ListIterator<og4> listIterator = this.f204075b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f143815o == i) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m219536b() {
        ListIterator<og4> listIterator = this.f204075b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().m164163d()) {
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m219537c() {
        if (NullChecker.m81303a(this.f204076c)) {
            CardSwipeConfig cardSwipeConfig = this.f204076c;
            if (cardSwipeConfig.swipe_left_male_during == 0 || cardSwipeConfig.swipe_right_male_during == 0) {
                this.f204076c = null;
            }
        }
        if (this.f204076c == null) {
            CardSwipeConfig cardSwipeConfigNew_ = CardSwipeConfig.new_();
            this.f204076c = cardSwipeConfigNew_;
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
        CardSwipeConfig cardSwipeConfig2 = this.f204076c;
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
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9) && userM169527p9.isFemale()) {
            CardSwipeConfig cardSwipeConfig3 = this.f204076c;
            f204053f = cardSwipeConfig3.swipe_left_female_during;
            f204054g = cardSwipeConfig3.swipe_right_female_during;
            f204055h = cardSwipeConfig3.swipe_up_female_during;
            f204056i = cardSwipeConfig3.swipe_auto_female_during;
            long j = cardSwipeConfig3.swipe_back_female_during;
            long j2 = f204052e;
            f204057j = j * j2;
            f204058k = cardSwipeConfig3.swipe_reset_female_during * j2;
            f204059l = t100.m186890d(cardSwipeConfig3.swipe_trans_y_female);
            CardSwipeConfig cardSwipeConfig4 = this.f204076c;
            f204061n = (float) cardSwipeConfig4.swipe_rotation_female;
            f204065r = (float) cardSwipeConfig4.swipe_speed_factor_female;
            f204066s = (float) cardSwipeConfig4.swipe_speed_check_female;
            f204067t = t100.m186890d(cardSwipeConfig4.swipe_item_diff_female);
            f204068u = t100.m186890d(this.f204076c.swipe_out_value_female);
            f204069v = t100.m186890d(this.f204076c.swipe_mine_value_female);
            CardSwipeConfig cardSwipeConfig5 = this.f204076c;
            f204062o = (float) cardSwipeConfig5.female_swipe_auto_width;
            f204063p = (float) cardSwipeConfig5.female_swipe_auto_factor;
            f204064q = (float) cardSwipeConfig5.female_swipe_auto_rotate;
            f204072y = cardSwipeConfig5.could_double_click;
            f204073z = (float) cardSwipeConfig5.swipe_type_factor;
        } else {
            CardSwipeConfig cardSwipeConfig6 = this.f204076c;
            long j3 = cardSwipeConfig6.swipe_left_male_during;
            long j4 = f204052e;
            f204053f = j3 * j4;
            f204054g = cardSwipeConfig6.swipe_right_male_during * j4;
            f204055h = cardSwipeConfig6.swipe_up_male_during * j4;
            f204056i = cardSwipeConfig6.swipe_auto_male_during * j4;
            f204057j = cardSwipeConfig6.swipe_back_male_during * j4;
            f204058k = cardSwipeConfig6.swipe_reset_male_during * j4;
            f204059l = t100.m186890d(cardSwipeConfig6.swipe_trans_y_male);
            CardSwipeConfig cardSwipeConfig7 = this.f204076c;
            f204061n = (float) cardSwipeConfig7.swipe_rotation_male;
            f204065r = (float) cardSwipeConfig7.swipe_speed_factor_male;
            f204066s = (float) cardSwipeConfig7.swipe_speed_check_male;
            f204067t = t100.m186890d(cardSwipeConfig7.swipe_item_diff_male);
            f204068u = t100.m186890d(this.f204076c.swipe_out_value_male);
            f204069v = t100.m186890d(this.f204076c.swipe_mine_value_male);
            CardSwipeConfig cardSwipeConfig8 = this.f204076c;
            f204062o = (float) cardSwipeConfig8.male_swipe_auto_width;
            f204063p = (float) cardSwipeConfig8.male_swipe_auto_factor;
            f204064q = (float) cardSwipeConfig8.male_swipe_auto_rotate;
            f204072y = cardSwipeConfig8.could_double_click;
            f204073z = (float) cardSwipeConfig8.swipe_type_factor;
        }
        f204037A = t100.m186890d(this.f204076c.swipe_fix_speed);
        CardSwipeConfig cardSwipeConfig9 = this.f204076c;
        f204043G = (float) cardSwipeConfig9.swipe_scale;
        f204044H = (float) cardSwipeConfig9.swipe_scale_start_alpha;
        f204045I = t100.m186890d(cardSwipeConfig9.swipe_progress_value);
        CardSwipeConfig cardSwipeConfig10 = this.f204076c;
        f204046J = cardSwipeConfig10.scale_opt;
        f204047K = cardSwipeConfig10.scale_opt_during * f204052e;
        f204048L = cardSwipeConfig10.scale_use_opt_during;
        f204049M = cardSwipeConfig10.scale_alpha_opt;
        f204050N = (float) cardSwipeConfig10.scale_alpha_speed;
    }

    /* JADX INFO: renamed from: d */
    public void m219538d(og4... og4VarArr) {
        if (og4VarArr == null || og4VarArr.length <= 0) {
            return;
        }
        for (og4 og4Var : og4VarArr) {
            this.f204075b.add(og4Var);
            this.f204074a.m220513N(og4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (og4 og4Var : this.f204075b) {
            if (og4Var.f143802b == CardAnimType.ANIM_INVALID) {
                og4Var.f143814n = true;
            } else {
                this.f204074a.m220512K(og4Var, jElapsedRealtime);
                boolean z2 = jElapsedRealtime >= og4Var.f143804d + og4Var.f143803c;
                if (z2) {
                    og4Var.f143814n = true;
                }
                z |= !z2;
            }
        }
        Iterator<og4> it = this.f204075b.iterator();
        while (it.hasNext()) {
            og4 next = it.next();
            if (next.f143814n) {
                if (BifrostLayout.f23321d) {
                    Objects.toString(next.f143802b);
                }
                it.remove();
                this.f204074a.m220511I(next, jElapsedRealtime);
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m219539e(List<og4> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (og4 og4Var : list) {
            this.f204075b.add(og4Var);
            this.f204074a.m220513N(og4Var);
        }
        Choreographer.getInstance().removeFrameCallback(this);
        doFrame(System.nanoTime());
    }

    /* JADX INFO: renamed from: f */
    public boolean m219540f() {
        ListIterator<og4> listIterator = this.f204075b.listIterator();
        while (listIterator.hasNext()) {
            og4 next = listIterator.next();
            if (next.f143802b == CardAnimType.ANIM_INSERT && next.f143807g == CardSwipeOutState.INVALID) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m219541g() {
        ListIterator<og4> listIterator = this.f204075b.listIterator();
        while (listIterator.hasNext()) {
            og4 next = listIterator.next();
            if (next.f143802b == CardAnimType.ANIM_OUT && (next.f143807g == CardSwipeOutState.INVALID || !next.f143810j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m219542h(int i) {
        if (BifrostLayout.f23321d) {
            this.f204075b.isEmpty();
            this.f204075b.size();
        }
        for (og4 og4Var : this.f204075b) {
            if (BifrostLayout.f23321d) {
                Objects.toString(og4Var.f143813m.toArray()[0]);
            }
            if (og4Var.m164172m(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m219543i(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f204040D = viewConfiguration.getScaledMinimumFlingVelocity();
        f204041E = viewConfiguration.getScaledMaximumFlingVelocity();
        String str = BifrostLayout.f23320c;
    }
}
