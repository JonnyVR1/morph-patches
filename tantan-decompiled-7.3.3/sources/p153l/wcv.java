package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class wcv implements iam<tcv> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f188506a;

    /* JADX INFO: renamed from: b */
    public VFrame f188507b;

    /* JADX INFO: renamed from: c */
    public VLinear f188508c;

    /* JADX INFO: renamed from: d */
    public final bav f188509d = new bav();

    /* JADX INFO: renamed from: e */
    public final List<BLiveVoiceSquareButton> f188510e = new ArrayList();

    public wcv(VNavigationBar vNavigationBar) {
        this.f188506a = vNavigationBar;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m205827d(List<BLiveVoiceSquareButton> list) {
        if (list.size() != this.f188510e.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(this.f188510e.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m205828e(final Act act) {
        VText vText = new VText(act);
        vText.setText("在线交友");
        vText.setTextSize(21.0f);
        vText.setTextColor(act.getResources().getColor(m9c0.f135369C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        this.f188506a.setTitleView(vText);
        this.f188506a.setBackgroundResource(m9c0.f135374H);
        this.f188507b = new VFrame(act);
        VLinear vLinear = new VLinear(act);
        this.f188508c = vLinear;
        this.f188506a.m224835z(vLinear, this.f188507b);
        this.f188506a.setLeftIconDrawable(act.getDrawable(nbc0.f141180m1));
        this.f188506a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ucv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m68056e2();
            }
        });
        act.setStatusBarColor(act.color(m9c0.f135378c));
        act.setNavigationBarColor(act.color(m9c0.f135378c));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m205829f(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.m72117d(bLiveVoiceSquareButton);
        int i = bnl0.f77545f;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        marginLayoutParams.leftMargin = qa00.m175859d(8.0f);
        this.f188508c.addView(virtualVoiceSquareTopBtnView, marginLayoutParams);
    }

    /* JADX INFO: renamed from: i */
    public void m205830i(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f188509d.m103240h(this.f188507b, liveVoiceInternalSquareBean);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m205831j(final Act act, List<BLiveVoiceSquareButton> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (m205827d(list)) {
            this.f188510e.clear();
            this.f188510e.addAll(list);
            this.f188508c.removeAllViews();
            if (jyb.m147479J(list)) {
                return;
            }
            jyb.m147537z(list, new y20() { // from class: l.vcv
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183488a.m205829f(act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tcv tcvVar) {
    }
}
