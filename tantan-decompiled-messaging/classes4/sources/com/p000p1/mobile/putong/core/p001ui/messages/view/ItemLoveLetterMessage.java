package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.view.ItemLoveLetterMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.a;
import com.p1.mobile.putong.core.view.LetterTextView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.d30;
import l.dml;
import l.ffx;
import l.i6q;
import l.j760;
import l.knb0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ItemLoveLetterMessage extends FrameLayout implements a {

    /* JADX INFO: renamed from: a */
    public ItemLoveLetterMessage f161a;

    /* JADX INFO: renamed from: b */
    public LoveLetterView f162b;

    /* JADX INFO: renamed from: c */
    public VLinear f163c;

    /* JADX INFO: renamed from: d */
    public VText f164d;

    /* JADX INFO: renamed from: e */
    public LetterTextView f165e;

    /* JADX INFO: renamed from: f */
    public VText f166f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f167g;

    public ItemLoveLetterMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m231a(Message message, View view) {
        CoreModule.c.f0.Po(((DbObject) message).id, false);
        zvf0.u("e_thanks_mind", "p_chat_view", new j760[]{vwb.Y("to_uid", CoreModule.H().userId())});
    }

    /* JADX INFO: renamed from: f */
    private Act m235f() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m236h(final Message message, View view) {
        zvf0.u("e_open_letter", "p_chat_view", new j760[]{vwb.Y("to_uid", CoreModule.H().userId())});
        CoreModule.P().a().E4(m235f(), CoreModule.c.e0.Pa(message.owner), new d30() { // from class: l.h6q
            public final void call() {
                CoreModule.c.f0.Po(((DbObject) message).id, true);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m237A(Message message) {
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> m238J() {
        return null;
    }

    /* JADX INFO: renamed from: U */
    public void m239U(dml dmlVar, final Message message, a.a aVar) {
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || messageAdditionalData.loveLetterInfo == null) {
            xdl0.E0(this.f162b, new View.OnClickListener() { // from class: l.g6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.c.f0.Kn(message2.cid, ((DbObject) message2).id);
                }
            });
            return;
        }
        if (message.isOtherUser()) {
            boolean zEquals = TEnum.equals(message.additionalData.loveLetterInfo.state, "default");
            LoveLetterView loveLetterView = this.f162b;
            if (zEquals) {
                xdl0.M(loveLetterView, true);
                xdl0.M(this.f163c, false);
                xdl0.E0(this.f162b, new View.OnClickListener() { // from class: l.e6q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9599a.m236h(message, view);
                    }
                });
            } else {
                xdl0.M(loveLetterView, false);
                xdl0.M(this.f163c, true);
                this.f165e.setText(message.value);
                m242i(CoreModule.c.e0.Pa(message.owner).name, CoreModule.c.e0.p9().name);
                if (TextUtils.equals(message.owner, CoreModule.H().userId()) || TEnum.equals(message.additionalData.loveLetterInfo.state, "replied")) {
                    xdl0.M(this.f167g, false);
                } else {
                    this.f167g.setText(String.format("感谢%s的心意", CoreModule.c.e0.Pa(message.owner).getPronoun()));
                    xdl0.M(this.f167g, true);
                    zvf0.A("e_thanks_mind", "p_chat_view", new j760[]{vwb.Y("to_uid", CoreModule.H().userId())});
                    xdl0.E0(this.f167g, new View.OnClickListener() { // from class: l.f6q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ItemLoveLetterMessage.m231a(message, view);
                        }
                    });
                }
            }
        } else {
            xdl0.M(this.f162b, false);
            xdl0.M(this.f163c, true);
            xdl0.M(this.f167g, false);
            this.f165e.setText(message.value);
            m242i(CoreModule.c.e0.p9().name, CoreModule.c.e0.Pa(message.cid).name);
        }
        zvf0.A("e_letter_message", "p_chat_view", new j760[]{vwb.Y("to_uid", message.isOtherUser() ? CoreModule.H().userId() : message.cid)});
    }

    /* JADX INFO: renamed from: e */
    public final void m240e(View view) {
        i6q.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m241g(String str) {
        return str.length() <= 6 ? str : str.substring(0, 6).concat("...");
    }

    /* JADX INFO: renamed from: i */
    public final void m242i(String str, String str2) {
        this.f164d.setText(String.format("To（   %s   ）", m241g(str2)));
        this.f166f.setText(String.format("By（   %s   ）", m241g(str)));
    }

    /* JADX INFO: renamed from: m */
    public void m243m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m240e(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ffx.d(i), 1073741824), i2);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
