package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.gta;
import p153l.h1e0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.ovb0;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRealShot extends ConstraintLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: d */
    public VDraweeView f32288d;

    /* JADX INFO: renamed from: e */
    public Message f32289e;

    /* JADX INFO: renamed from: f */
    public Shape f32290f;

    /* JADX INFO: renamed from: g */
    public VText f32291g;

    /* JADX INFO: renamed from: h */
    public ImageView f32292h;

    /* JADX INFO: renamed from: i */
    public int f32293i;

    public enum Shape {
        LEFT,
        RIGHT
    }

    public ItemRealShot(Context context) {
        super(context);
        this.f32293i = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m49806l0(View view) {
        List<Media> list;
        Message message = this.f32289e;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = list.get(0);
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.url)) {
            CoreModule.m30933P().m143412i().mo180344J4((Act) getContext(), this.f32289e, media);
            i4g0.m138523u("e_camera_chat_message", OMSDialogPositon.p_chat_view, new pf60("sender_user_id", this.f32289e.owner), new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, this.f32289e.f56859id));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32289e = message;
        if (message.media == null) {
            return;
        }
        i4g0.m138492A("e_camera_chat_message", OMSDialogPositon.p_chat_view, new pf60("sender_user_id", message.owner), new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id));
        this.f32291g.setText(TextUtils.isEmpty(message.value.trim()) ? getResources().getString(R$string.f21583Q4) : message.value.trim());
        m49809m0(this.f32290f, this.f32288d);
        Media media = message.media.get(0);
        if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m82486a(((Video) media).cover.url))) {
            uqb0.f180374G.m127127R0(this.f32288d, media.cover().calculatedWidth(getWidth()), "chat");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m49807j0(int i, boolean z) {
        this.f32290f = z ? Shape.RIGHT : Shape.LEFT;
        this.f32288d = (VDraweeView) findViewById(edc0.f93319Z2);
        this.f32291g = (VText) findViewById(edc0.f93206G3);
        this.f32292h = (ImageView) findViewById(edc0.f93202G);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32292h.setImageResource(ibc0.f113898R2);
        }
        this.f32288d.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cfq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f81549a.m49808k0(view);
            }
        });
        bnl0.m105509E0(this.f32288d, new View.OnClickListener() { // from class: l.dfq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88213a.m49806l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m49808k0(View view) {
        this.f32293i = 0;
        ItemMessageBase.m49494R(this).onLongClick(this.f32288d);
        this.f32293i = -1;
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        m49807j0(i + 1, z);
    }

    /* JADX INFO: renamed from: m0 */
    public void m49809m0(Shape shape, VDraweeView vDraweeView) {
        int i = qa00.f156322i;
        RoundingParams roundingParamsM8302b = RoundingParams.m8302b(i, i, i, i);
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(uqb0.f180374G.m98795l().m211638a());
        }
        vDraweeView.getHierarchy().m207045H(roundingParamsM8302b);
        vDraweeView.getHierarchy().m207064y(0);
        vDraweeView.getHierarchy().m207043F(getContext().getResources().getDrawable(this.f32289e.isMe() ? ibc0.f114166w0 : ibc0.f114157v0), h1e0.f107450g);
    }

    public ItemRealShot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32293i = -1;
    }

    public ItemRealShot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32293i = -1;
    }
}
