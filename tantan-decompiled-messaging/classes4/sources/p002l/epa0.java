package p002l;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.match.a;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.ew40;
import l.fpa0;
import l.mkd0;
import l.t0g0;
import l.t100;
import l.u59;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VFrame_FlipContainer;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class epa0 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f9902a;

    /* JADX INFO: renamed from: b */
    public VLinear f9903b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f9904c;

    /* JADX INFO: renamed from: d */
    public VText f9905d;

    /* JADX INFO: renamed from: e */
    public VLinear f9906e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f9907f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f9908g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f9909h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f9910i;

    /* JADX INFO: renamed from: j */
    public VImage f9911j;

    /* JADX INFO: renamed from: k */
    public VText f9912k;

    /* JADX INFO: renamed from: l */
    public VFrame_Shadow f9913l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f9914m;

    /* JADX INFO: renamed from: n */
    public VLinear f9915n;

    /* JADX INFO: renamed from: o */
    public VLinear f9916o;

    /* JADX INFO: renamed from: p */
    public VLinear f9917p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f9918q;

    /* JADX INFO: renamed from: r */
    public VLinear f9919r;

    /* JADX INFO: renamed from: s */
    public VImage f9920s;

    /* JADX INFO: renamed from: t */
    public VText f9921t;

    /* JADX INFO: renamed from: u */
    public VLinear f9922u;

    /* JADX INFO: renamed from: v */
    public VImage f9923v;

    /* JADX INFO: renamed from: w */
    public LetterRemainingSwitcherView f9924w;

    /* JADX INFO: renamed from: x */
    public boolean f9925x = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12646b(Act act, User user, d30 d30Var, View view) {
        zvf0.r("e_intl_instantmatch_btn", "p_suggest_user_profile_info_view");
        a.w().p(act, user, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", d30Var);
    }

    /* JADX INFO: renamed from: e */
    public void m12649e(View view) {
        fpa0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m12650f(final Act act, final User user, String str, final d30 d30Var) {
        m12651g(act);
        xdl0.E0(this.f9922u, new View.OnClickListener() { // from class: l.apa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                epa0.m12646b(act, user, d30Var, view);
            }
        });
        if (NullChecker.a(user)) {
            zvf0.x("e_intl_instantmatch_btn", "p_suggest_user_profile_info_view");
        }
        this.f9902a.post(new Runnable() { // from class: l.bpa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8301a.m12652h();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m12651g(Act act) {
        if (u59.U()) {
            m12655k();
            m12654j(vwb.f0(new String[]{act.getString(R.string.Xf)}));
        } else if (b.t() && ew40.h().a()) {
            ew40.h().p();
            act.duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("instantChat")).distinctUntilChanged(new w9j() { // from class: l.cpa0
                public final Object call(Object obj) {
                    return Integer.valueOf(((UserPrivilege) obj).content.remaining);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.dpa0
                public final void call(Object obj) {
                    this.f9381a.m12653i((UserPrivilege) obj);
                }
            }));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("一键配对");
            m12654j(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m12652h() {
        if (xdl0.O0(this.f9904c) && xdl0.O0(this.f9922u) && this.f9922u.getRight() > this.f9902a.getWidth()) {
            xdl0.D0(t100.d(48.0f), new View[]{this.f9922u});
            this.f9925x = true;
            this.f9924w.i();
            xdl0.M(this.f9924w, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m12653i(UserPrivilege userPrivilege) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        int i = userPrivilege.content.remaining;
        if (i > 0) {
            arrayList.add(String.format("剩余%s次", t0g0.a(i, 99L)));
        }
        m12654j(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final void m12654j(List<String> list) {
        if (this.f9925x) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9924w.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.d(2.0f);
        this.f9924w.setLayoutParams(layoutParams);
        xdl0.M(this.f9924w, true);
        this.f9924w.i();
        this.f9924w.setTextList(list);
        this.f9924w.setOutTranslateY(0.5f);
        this.f9924w.setAnimateDirection(false);
        this.f9924w.setInOutAnimation(300L);
        this.f9924w.h();
    }

    /* JADX INFO: renamed from: k */
    public void m12655k() {
        this.f9922u.setBackgroundResource(x2c0.Oc);
        this.f9923v.setImageResource(x2c0.Pc);
        this.f9924w.setTextColor(Color.parseColor("#F9E7FF"));
        ConstraintLayout.a layoutParams = this.f9903b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = t100.d(16.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = t100.d(16.0f);
        this.f9903b.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9920s.getLayoutParams();
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = 0;
        this.f9920s.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f9922u.getLayoutParams();
        layoutParams3.width = 0;
        layoutParams3.weight = 1.0f;
        this.f9922u.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f9919r.getLayoutParams();
        layoutParams4.width = t100.d(48.0f);
        this.f9919r.setLayoutParams(layoutParams4);
        this.f9919r.setGravity(17);
        xdl0.M(this.f9921t, false);
    }
}
