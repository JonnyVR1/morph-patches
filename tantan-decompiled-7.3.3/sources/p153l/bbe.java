package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bbe extends dh2<RelativeLayout> implements arl {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f75938d;

    /* JADX INFO: renamed from: e */
    public VText f75939e;

    /* JADX INFO: renamed from: f */
    public VText f75940f;

    /* JADX INFO: renamed from: g */
    public TextView f75941g;

    /* JADX INFO: renamed from: h */
    public p9s f75942h;

    public bbe(LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m103266O() {
        m103271S(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m103267P(View view) {
        this.f75942h.m171372b(new x20() { // from class: l.abe
            @Override // p153l.x20
            public final void call() {
                this.f69604a.m103266O();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m103268N(LiveMessage liveMessage, View view) {
        this.f75942h.m171373c(liveMessage.getDragonSchema());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RelativeLayout relativeLayout) {
        super.mo71749u(relativeLayout);
        this.f75938d = relativeLayout;
        this.f75939e = (VText) relativeLayout.findViewById(mdc0.f136007N6);
        this.f75940f = (VText) relativeLayout.findViewById(mdc0.f136072V);
        this.f75941g = (TextView) relativeLayout.findViewById(mdc0.f135911D0);
        if (jyb.m147479J(this.f88411a.spanList)) {
            return;
        }
        yql yqlVar = this.f88412b;
        LiveMessage liveMessage = this.f88411a;
        m103270R(yqlVar, liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: R */
    public void m103270R(yql yqlVar, final LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f75942h = yqlVar.getLiveDragonListViewHelper();
        this.f75939e.setText(liveMessage.getDragonTitle());
        boolean zM171374d = this.f75942h.m171374d();
        m103271S(zM171374d);
        bnl0.m105509E0(this.f75938d, new View.OnClickListener() { // from class: l.yae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198176a.m103268N(liveMessage, view);
            }
        });
        VText vText = this.f75940f;
        if (zM171374d) {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.zae
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203551a.m103267P(view);
                }
            });
        } else {
            bnl0.m105509E0(vText, null);
        }
        dy4.m118615y(spannableStringBuilder, this.f75941g, yqlVar, qa00.f156328o);
        this.f75941g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m103271S(boolean z) {
        VText vText = this.f75940f;
        if (z) {
            vText.setText("关闭推送");
            this.f75940f.setBackgroundResource(obc0.f146327f1);
            this.f75940f.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            vText.setText("推送已关闭");
            this.f75940f.setBackgroundResource(0);
            this.f75940f.setTextColor(Color.parseColor("#66FFFFFF"));
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198895R;
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
    }
}
