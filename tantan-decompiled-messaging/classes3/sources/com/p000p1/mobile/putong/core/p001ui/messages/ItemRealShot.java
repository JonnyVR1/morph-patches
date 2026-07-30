package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.ftd0;
import l.j760;
import l.knb0;
import l.qib0;
import l.t100;
import l.ura;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemRealShot extends ConstraintLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: d */
    public VDraweeView f1331d;

    /* JADX INFO: renamed from: e */
    public Message f1332e;

    /* JADX INFO: renamed from: f */
    public Shape f1333f;

    /* JADX INFO: renamed from: g */
    public VText f1334g;

    /* JADX INFO: renamed from: h */
    public ImageView f1335h;

    /* JADX INFO: renamed from: i */
    public int f1336i;

    public enum Shape {
        LEFT,
        RIGHT
    }

    public ItemRealShot(Context context) {
        super(context);
        this.f1336i = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m1707l0(View view) {
        List list;
        Message message = this.f1332e;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = (Media) list.get(0);
        if (NullChecker.a(media) && NullChecker.a(media.url)) {
            CoreModule.P().i().J4(getContext(), this.f1332e, media);
            zvf0.u("e_camera_chat_message", "p_chat_view", new j760[]{new j760("sender_user_id", this.f1332e.owner), new j760("message_id", ((DbObject) this.f1332e).id)});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1332e = message;
        if (message.media == null) {
            return;
        }
        zvf0.A("e_camera_chat_message", "p_chat_view", new j760[]{new j760("sender_user_id", message.owner), new j760("message_id", ((DbObject) message).id)});
        this.f1334g.setText(TextUtils.isEmpty(message.value.trim()) ? getResources().getString(R.string.Q4) : message.value.trim());
        m1710m0(this.f1333f, this.f1331d);
        Video video = (Media) message.media.get(0);
        if (!TEnum.equals(((Media) video).status, "raw") || ((video instanceof Video) && NullChecker.a(((Media) video.cover).url))) {
            qib0.G.R0(this.f1331d, video.cover().calculatedWidth(getWidth()), "chat");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m1708j0(int i, boolean z) {
        this.f1333f = z ? Shape.RIGHT : Shape.LEFT;
        this.f1331d = (VDraweeView) findViewById(y4c0.Z2);
        this.f1334g = (VText) findViewById(y4c0.G3);
        this.f1335h = (ImageView) findViewById(y4c0.G);
        if (ura.e().d().I4()) {
            this.f1335h.setImageResource(c3c0.R2);
        }
        this.f1331d.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f2623a.m1709k0(view);
            }
        });
        xdl0.E0(this.f1331d, new View.OnClickListener() { // from class: l.ddq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2945a.m1707l0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m1709k0(View view) {
        this.f1336i = 0;
        ItemMessageBase.m1395R(this).onLongClick(this.f1331d);
        this.f1336i = -1;
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        m1708j0(i + 1, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public void m1710m0(Shape shape, VDraweeView vDraweeView) {
        int i = t100.i;
        RoundingParams roundingParamsB = RoundingParams.b(i, i, i, i);
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(qib0.G.l().a());
        }
        vDraweeView.getHierarchy().H(roundingParamsB);
        vDraweeView.getHierarchy().y(0);
        vDraweeView.getHierarchy().F(getContext().getResources().getDrawable(this.f1332e.isMe() ? c3c0.w0 : c3c0.v0), ftd0.g);
    }

    public ItemRealShot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1336i = -1;
    }

    public ItemRealShot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1336i = -1;
    }
}
