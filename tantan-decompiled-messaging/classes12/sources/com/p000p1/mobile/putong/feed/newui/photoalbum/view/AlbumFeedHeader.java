package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.t100;
import l.xaj0;
import l.xdl0;
import p007l.b5c0;
import p007l.o6c0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AlbumFeedHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f3798c;

    /* JADX INFO: renamed from: d */
    public FeedSendMomentEnterView f3799d;

    /* JADX INFO: renamed from: e */
    public String f3800e;

    /* JADX INFO: renamed from: f */
    public FeedAlbumPersionTitleView f3801f;

    public AlbumFeedHeader(Context context) {
        super(context);
        m6162S(context);
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
    /* JADX INFO: renamed from: P */
    public final void m6159P(e30 e30Var) {
        int i = FeedModule.m1139F().userId().equals(this.f3800e) ? 0 : 8;
        if (i != this.f3799d.getVisibility()) {
            this.f3799d.setVisibility(i);
        }
        this.f3799d.m6325g0(e30Var);
        this.f3799d.m6326h0(e30Var);
        this.f3798c.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public void m6160Q() {
        if (NullChecker.a(this.f3801f)) {
            this.f3801f.m5492k0();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m6161R(String str) {
        this.f3800e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m6162S(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(o6c0.f11339y, (ViewGroup) this, true);
        this.f3798c = findViewById(b5c0.f5986O);
        this.f3799d = (FeedSendMomentEnterView) findViewById(b5c0.f5964G1);
        this.f3801f = (FeedAlbumPersionTitleView) findViewById(b5c0.f6062k);
        TextPaint paint = this.f3798c.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f3799d.setPageId("p_album");
        this.f3799d.m6321a0();
        if (User.isWisdomStar(this.f3800e)) {
            xdl0.M(this.f3798c, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m6163T(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        this.f3799d.m6327i0(xaj0Var, z);
    }

    /* JADX INFO: renamed from: V */
    public void m6164V(User user, d30 d30Var) {
        if (NullChecker.a(this.f3801f)) {
            this.f3801f.m5495n0(user, this.f3800e, d30Var);
            if (User.isWisdomStar(this.f3800e)) {
                xdl0.M(this.f3798c, true);
                xdl0.V(this.f3798c, t100.j);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m6165W(User user, PhotoAlbumFeedAct photoAlbumFeedAct, String str, BubbleInfo bubbleInfo) {
        if (NullChecker.a(this.f3801f)) {
            this.f3801f.m5496o0(user, photoAlbumFeedAct, str, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m6166X(boolean z, e30<String> e30Var) {
        if (z) {
            m6159P(e30Var);
        }
    }

    public void setUserId(String str) {
        this.f3800e = str;
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6162S(context);
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6162S(context);
    }
}
