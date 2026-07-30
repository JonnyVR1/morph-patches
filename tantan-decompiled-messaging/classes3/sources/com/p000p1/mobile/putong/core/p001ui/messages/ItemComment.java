package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.e51;
import l.knb0;
import l.pii0;
import l.qib0;
import l.t100;
import l.vwb;
import l.y4c0;
import p003l.eqh0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemComment extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VText f779a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f780b;

    /* JADX INFO: renamed from: c */
    public View f781c;

    /* JADX INFO: renamed from: d */
    public boolean f782d;

    /* JADX INFO: renamed from: e */
    public ImageView f783e;

    /* JADX INFO: renamed from: f */
    public View f784f;

    public ItemComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m1180c() {
        e51.q(this.f779a.getText().toString());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        this.f779a.setText(CoreModule.b.getString(R.string.k4) + message.value + CoreModule.b.getString(R.string.l4));
        Picture picture = null;
        final CoreMomentInfo coreMomentInfoMh = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : CoreModule.N().Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.a(coreMomentInfoMh)) {
            this.f780b.getHierarchy().E(new pii0(" ", t100.d(28.0f), t100.d(14.0f), eqh0.m3924c(2), 0, pii0.j, this.f782d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f780b.getHierarchy().c((Drawable) null);
            this.f780b.setOnClickListener(null);
            qib0.G.o(this.f780b);
            this.f779a.setText(R.string.s4);
            return;
        }
        this.f780b.getHierarchy().E(new pii0(" ", t100.d(28.0f), t100.d(14.0f), eqh0.m3924c(2), 0, pii0.j, this.f782d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfoMh.media.size();
        VDraweeView vDraweeView = this.f780b;
        if (size == 0) {
            vDraweeView.getHierarchy().c(getResources().getDrawable(c3c0.h5));
            this.f781c.setVisibility(8);
            qib0.G.o(this.f780b);
        } else {
            vDraweeView.getHierarchy().c((Drawable) null);
            Video video = (Media) coreMomentInfoMh.media.get(0);
            boolean z = video instanceof Video;
            View view = this.f781c;
            if (z) {
                view.setVisibility(0);
                picture = video.cover;
            } else {
                view.setVisibility(8);
                if (video instanceof Picture) {
                    picture = (Picture) video;
                }
            }
            if (NullChecker.a(picture)) {
                qib0.G.Q0(this.f780b, picture.momentPictureSmall());
            } else {
                qib0.G.o(this.f780b);
            }
        }
        this.f780b.setVisibility(0);
        this.f780b.setOnClickListener(new View.OnClickListener() { // from class: l.g2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f3790a.m1181d(coreMomentInfoMh, message, view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.f2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f3450a.m1180c();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1181d(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.N().argsToMomentsSimpleTextAct(getContext(), ((CopyObject) coreMomentInfo).id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.N().argsToMomentsFeedPreviewAct(getContext(), ((CopyObject) coreMomentInfo).id, 0, false, "ItemComment", ((DbObject) message).id));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f782d = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f780b = (VDraweeView) findViewById(y4c0.o1);
        this.f781c = findViewById(y4c0.k3);
        VText vText = (VText) findViewById(y4c0.A4);
        this.f779a = vText;
        vText.setBackgroundDrawable((Drawable) null);
        this.f783e = (ImageView) findViewById(y4c0.k1);
        this.f784f = findViewById(y4c0.Z);
    }

    public ItemComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
