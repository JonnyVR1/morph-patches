package com.p051p1.mobile.putong.live.external.voice.entry;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveFeedSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.abn0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;
import p153l.jyn0;
import p153l.mbc0;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.tbs;
import p153l.ybn0;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceConversationsEntry extends FrameLayout implements iam<ybn0> {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntry f47244a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f47245b;

    /* JADX INFO: renamed from: c */
    public TextView f47246c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f47247d;

    /* JADX INFO: renamed from: e */
    public VoiceFeedEntryFloatingAnim f47248e;

    /* JADX INFO: renamed from: f */
    public VImage f47249f;

    /* JADX INFO: renamed from: g */
    public VText f47250g;

    /* JADX INFO: renamed from: h */
    public VImage f47251h;

    /* JADX INFO: renamed from: i */
    public final List<Picture.ImageUri> f47252i;

    public VoiceConversationsEntry(@NonNull Context context) {
        super(context);
        this.f47252i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m72131f(View view) {
        if (getContext() != null) {
            m72139l();
            getContext().startActivity(VoiceConversationEntryAct.m72128Y1(getContext()));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m72132j() {
        bnl0.m105509E0(this.f47244a, new View.OnClickListener() { // from class: l.tan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172749a.m72131f(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    private void m72133k(VText vText, boolean z) {
        if (z) {
            bnl0.m105538V(vText, qa00.m175859d(0.0f));
        } else {
            bnl0.m105538V(vText, qa00.m175859d(3.0f));
        }
    }

    private void setEntryMainLayout(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f47245b.getLayoutParams();
        layoutParams.width = qa00.m175859d(z ? 224.0f : 200.0f);
        this.f47245b.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m72134b(View view) {
        abn0.m96773a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m72136d() {
        bnl0.m105524M(this.f47244a, false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m72137e() {
        bnl0.m105524M(this.f47250g, false);
        bnl0.m105524M(this.f47251h, false);
    }

    /* JADX INFO: renamed from: i */
    public void m72138i(List<User> list, BLiveFeedSummary bLiveFeedSummary, boolean z) {
        this.f47252i.clear();
        if (!TextUtils.isEmpty(bLiveFeedSummary.description)) {
            this.f47246c.setText(bLiveFeedSummary.description);
        }
        if (!TextUtils.isEmpty(bLiveFeedSummary.subDescription)) {
            this.f47247d.setText(bLiveFeedSummary.subDescription);
        }
        if (list.size() >= 3) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                this.f47252i.add(it.next().m61308fp().profileSmall());
            }
            setEntryMainLayout(true);
            this.f47245b.setBackgroundResource(jyn0.m147611h() ? mbc0.f135664X : mbc0.f135663W);
            this.f47248e.m72144d(2);
            this.f47248e.setImageUrlList(jyb.m147486Q(this.f47252i, new qcj() { // from class: l.uan0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Picture.ImageUri) obj).formatted();
                }
            }));
            this.f47248e.m72152l();
            bnl0.m105524M(this.f47249f, false);
            bnl0.m105524M(this.f47248e, true);
        } else {
            setEntryMainLayout(false);
            this.f47245b.setBackgroundResource(jyn0.m147611h() ? mbc0.f135665Y : mbc0.f135666Z);
            bnl0.m105524M(this.f47248e, false);
            bnl0.m105524M(this.f47249f, true);
        }
        if (z) {
            bnl0.m105524M(this.f47244a, true);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m72139l() {
        i4g0.m138520r("e_voice_chat", OMSDialogPositon.p_messages_view);
        i4g0.m138523u("e_audio_red_dot_voice_chat", OMSDialogPositon.p_messages_view, new pf60("tooltips_type", "red_dot"), new pf60("tooltips_type_ui", bnl0.m105529O0(this.f47250g) ? "red_dot_figure" : "red_dot_normal"), new pf60("tooltips_trigger_reason", "follow_anchor_start_audio"), new pf60("red_dot_num", bnl0.m105529O0(this.f47250g) ? this.f47250g.getText() : "NA"));
    }

    /* JADX INFO: renamed from: m */
    public void m72140m() {
        i4g0.m138492A("e_audio_red_dot_voice_chat", OMSDialogPositon.p_messages_view, new pf60("tooltips_type", "red_dot"), new pf60("tooltips_type_ui", bnl0.m105529O0(this.f47250g) ? "red_dot_figure" : "red_dot_normal"), new pf60("tooltips_trigger_reason", "follow_anchor_start_audio"), new pf60("red_dot_num", bnl0.m105529O0(this.f47250g) ? this.f47250g.getText() : "NA"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72134b(this);
        m72132j();
    }

    public void setRedDot(int i) {
        if (tbs.f172989b.m203540V5()) {
            if (i >= 0 && i <= 99) {
                m72133k(this.f47250g, false);
                this.f47250g.setText(String.valueOf(i));
            } else if (i > 99) {
                m72133k(this.f47250g, true);
                this.f47250g.setText("99+");
            }
            bnl0.m105524M(this.f47250g, i > 0);
            bnl0.m105524M(this.f47251h, false);
        } else {
            bnl0.m105524M(this.f47250g, false);
            bnl0.m105524M(this.f47251h, true);
        }
        m72140m();
    }

    public VoiceConversationsEntry(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47252i = new ArrayList();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ybn0 ybn0Var) {
    }
}
