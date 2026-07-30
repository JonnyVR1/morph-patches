package com.p046p1.mobile.putong.live.external.voice.entry;

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
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveFeedSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.fpn0;
import p149l.g3c0;
import p149l.j760;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.u2n0;
import p149l.vwb;
import p149l.w1n0;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceConversationsEntry extends FrameLayout implements s7m<u2n0> {

    /* JADX INFO: renamed from: a */
    public VoiceConversationsEntry f46396a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f46397b;

    /* JADX INFO: renamed from: c */
    public TextView f46398c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f46399d;

    /* JADX INFO: renamed from: e */
    public VoiceFeedEntryFloatingAnim f46400e;

    /* JADX INFO: renamed from: f */
    public VImage f46401f;

    /* JADX INFO: renamed from: g */
    public VText f46402g;

    /* JADX INFO: renamed from: h */
    public VImage f46403h;

    /* JADX INFO: renamed from: i */
    public final List<Picture.ImageUri> f46404i;

    public VoiceConversationsEntry(@NonNull Context context) {
        super(context);
        this.f46404i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m70948f(View view) {
        if (getContext() != null) {
            m70956l();
            getContext().startActivity(VoiceConversationEntryAct.m70945X1(getContext()));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m70949j() {
        xdl0.m208329E0(this.f46396a, new View.OnClickListener() { // from class: l.p1n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146748a.m70948f(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    private void m70950k(VText vText, boolean z) {
        if (z) {
            xdl0.m208358V(vText, t100.m186890d(0.0f));
        } else {
            xdl0.m208358V(vText, t100.m186890d(3.0f));
        }
    }

    private void setEntryMainLayout(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46397b.getLayoutParams();
        layoutParams.width = t100.m186890d(z ? 224.0f : 200.0f);
        this.f46397b.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m70951b(View view) {
        w1n0.m200945a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m70953d() {
        xdl0.m208344M(this.f46396a, false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m70954e() {
        xdl0.m208344M(this.f46402g, false);
        xdl0.m208344M(this.f46403h, false);
    }

    /* JADX INFO: renamed from: i */
    public void m70955i(List<User> list, BLiveFeedSummary bLiveFeedSummary, boolean z) {
        this.f46404i.clear();
        if (!TextUtils.isEmpty(bLiveFeedSummary.description)) {
            this.f46398c.setText(bLiveFeedSummary.description);
        }
        if (!TextUtils.isEmpty(bLiveFeedSummary.subDescription)) {
            this.f46399d.setText(bLiveFeedSummary.subDescription);
        }
        if (list.size() >= 3) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                this.f46404i.add(it.next().m60124fp().profileSmall());
            }
            setEntryMainLayout(true);
            this.f46397b.setBackgroundResource(fpn0.m122618h() ? g3c0.f100402X : g3c0.f100401W);
            this.f46400e.m70961d(2);
            this.f46400e.setImageUrlList(vwb.m200303Q(this.f46404i, new w9j() { // from class: l.q1n0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture.ImageUri) obj).formatted();
                }
            }));
            this.f46400e.m70969l();
            xdl0.m208344M(this.f46401f, false);
            xdl0.m208344M(this.f46400e, true);
        } else {
            setEntryMainLayout(false);
            this.f46397b.setBackgroundResource(fpn0.m122618h() ? g3c0.f100403Y : g3c0.f100404Z);
            xdl0.m208344M(this.f46400e, false);
            xdl0.m208344M(this.f46401f, true);
        }
        if (z) {
            xdl0.m208344M(this.f46396a, true);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m70956l() {
        zvf0.m220396r("e_voice_chat", OMSDialogPositon.p_messages_view);
        zvf0.m220399u("e_audio_red_dot_voice_chat", OMSDialogPositon.p_messages_view, new j760("tooltips_type", "red_dot"), new j760("tooltips_type_ui", xdl0.m208349O0(this.f46402g) ? "red_dot_figure" : "red_dot_normal"), new j760("tooltips_trigger_reason", "follow_anchor_start_audio"), new j760("red_dot_num", xdl0.m208349O0(this.f46402g) ? this.f46402g.getText() : "NA"));
    }

    /* JADX INFO: renamed from: m */
    public void m70957m() {
        zvf0.m220368A("e_audio_red_dot_voice_chat", OMSDialogPositon.p_messages_view, new j760("tooltips_type", "red_dot"), new j760("tooltips_type_ui", xdl0.m208349O0(this.f46402g) ? "red_dot_figure" : "red_dot_normal"), new j760("tooltips_trigger_reason", "follow_anchor_start_audio"), new j760("red_dot_num", xdl0.m208349O0(this.f46402g) ? this.f46402g.getText() : "NA"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70951b(this);
        m70949j();
    }

    public void setRedDot(int i) {
        if (s9s.f163228b.m195753V5()) {
            if (i >= 0 && i <= 99) {
                m70950k(this.f46402g, false);
                this.f46402g.setText(String.valueOf(i));
            } else if (i > 99) {
                m70950k(this.f46402g, true);
                this.f46402g.setText("99+");
            }
            xdl0.m208344M(this.f46402g, i > 0);
            xdl0.m208344M(this.f46403h, false);
        } else {
            xdl0.m208344M(this.f46402g, false);
            xdl0.m208344M(this.f46403h, true);
        }
        m70957m();
    }

    public VoiceConversationsEntry(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46404i = new ArrayList();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u2n0 u2n0Var) {
    }
}
