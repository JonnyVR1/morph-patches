package p149l;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class epa0 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f92616a;

    /* JADX INFO: renamed from: b */
    public VLinear f92617b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f92618c;

    /* JADX INFO: renamed from: d */
    public VText f92619d;

    /* JADX INFO: renamed from: e */
    public VLinear f92620e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f92621f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f92622g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f92623h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f92624i;

    /* JADX INFO: renamed from: j */
    public VImage f92625j;

    /* JADX INFO: renamed from: k */
    public VText f92626k;

    /* JADX INFO: renamed from: l */
    public VFrame_Shadow f92627l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f92628m;

    /* JADX INFO: renamed from: n */
    public VLinear f92629n;

    /* JADX INFO: renamed from: o */
    public VLinear f92630o;

    /* JADX INFO: renamed from: p */
    public VLinear f92631p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f92632q;

    /* JADX INFO: renamed from: r */
    public VLinear f92633r;

    /* JADX INFO: renamed from: s */
    public VImage f92634s;

    /* JADX INFO: renamed from: t */
    public VText f92635t;

    /* JADX INFO: renamed from: u */
    public VLinear f92636u;

    /* JADX INFO: renamed from: v */
    public VImage f92637v;

    /* JADX INFO: renamed from: w */
    public LetterRemainingSwitcherView f92638w;

    /* JADX INFO: renamed from: x */
    public boolean f92639x = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m117606b(Act act, User user, d30 d30Var, View view) {
        zvf0.m220396r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        C8455a.m47588w().m47610p(act, user, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", d30Var);
    }

    /* JADX INFO: renamed from: e */
    public void m117609e(View view) {
        fpa0.m122567a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m117610f(final Act act, final User user, String str, final d30 d30Var) {
        m117611g(act);
        xdl0.m208329E0(this.f92636u, new View.OnClickListener() { // from class: l.apa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                epa0.m117606b(act, user, d30Var, view);
            }
        });
        if (NullChecker.m81303a(user)) {
            zvf0.m220402x("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        this.f92616a.post(new Runnable() { // from class: l.bpa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76615a.m117612h();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m117611g(Act act) {
        if (u59.m191812U()) {
            m117615k();
            m117614j(vwb.m200324f0(act.getString(R$string.f18272Xf)));
        } else if (C8456b.m47640t() && ew40.m118397h().m118401a()) {
            ew40.m118397h().m118412p();
            act.duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("instantChat")).distinctUntilChanged(new w9j() { // from class: l.cpa0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((UserPrivilege) obj).content.remaining);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.dpa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87250a.m117613i((UserPrivilege) obj);
                }
            }));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("一键配对");
            m117614j(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m117612h() {
        if (xdl0.m208349O0(this.f92618c) && xdl0.m208349O0(this.f92636u) && this.f92636u.getRight() > this.f92616a.getWidth()) {
            xdl0.m208327D0(t100.m186890d(48.0f), this.f92636u);
            this.f92639x = true;
            this.f92638w.m57726i();
            xdl0.m208344M(this.f92638w, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m117613i(UserPrivilege userPrivilege) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        int i = userPrivilege.content.remaining;
        if (i > 0) {
            arrayList.add(String.format("剩余%s次", t0g0.m186860a(i, 99L)));
        }
        m117614j(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final void m117614j(List<String> list) {
        if (this.f92639x) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f92638w.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.m186890d(2.0f);
        this.f92638w.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f92638w, true);
        this.f92638w.m57726i();
        this.f92638w.setTextList(list);
        this.f92638w.setOutTranslateY(0.5f);
        this.f92638w.setAnimateDirection(false);
        this.f92638w.setInOutAnimation(300L);
        this.f92638w.m57725h();
    }

    /* JADX INFO: renamed from: k */
    public void m117615k() {
        this.f92636u.setBackgroundResource(x2c0.f189606Oc);
        this.f92637v.setImageResource(x2c0.f189637Pc);
        this.f92638w.setTextColor(Color.parseColor("#F9E7FF"));
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f92617b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).width = -1;
        ((ViewGroup.MarginLayoutParams) c0220a).leftMargin = t100.m186890d(16.0f);
        ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(16.0f);
        this.f92617b.setLayoutParams(c0220a);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f92634s.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.leftMargin = 0;
        this.f92634s.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f92636u.getLayoutParams();
        layoutParams2.width = 0;
        layoutParams2.weight = 1.0f;
        this.f92636u.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f92633r.getLayoutParams();
        layoutParams3.width = t100.m186890d(48.0f);
        this.f92633r.setLayoutParams(layoutParams3);
        this.f92633r.setGravity(17);
        xdl0.m208344M(this.f92635t, false);
    }
}
