package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p153l.edc0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakingQuestion extends ConstraintLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: d */
    public VText f31878d;

    /* JADX INFO: renamed from: e */
    public ItemText f31879e;

    /* JADX INFO: renamed from: f */
    public VText f31880f;

    public ItemIceBreakingQuestion(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        String strConcat;
        if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.iceBreakingQuestion)) {
            this.f31878d.setText(String.format("%s", message.additionalData.iceBreakingQuestion.content));
        }
        this.f31879e.setText(message.value);
        Object tag = this.f31880f.getTag();
        if (!(tag instanceof String)) {
            this.f31880f.setText("");
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
        boolean z = userM116503Pa != null && userM116503Pa.isFemale();
        if (tag.equals(BLiveGiftBubblePopupTitlePosition.left)) {
            strConcat = (z ? "她" : "他").concat("回答了我的问题");
        } else {
            strConcat = "我回答了她的问题";
        }
        this.f31880f.setText(strConcat);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.r6q
            @Override // java.lang.Runnable
            public final void run() {
                this.f161488a.m49391i0();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m49391i0() {
        l51.m152911q(this.f31879e.getText().toString());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31878d = (VText) findViewById(edc0.f93494y3);
        this.f31879e = (ItemText) findViewById(edc0.f93364g);
        this.f31880f = (VText) findViewById(edc0.f93211H2);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakingQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
