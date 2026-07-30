package com.p051p1.mobile.putong.core.p058ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC21509y4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "c", "(Lcom/p1/mobile/android/app/Act;)V", "", "f", "()Z", "hidden", Constants.INAPP_DATA_TAG, "(Z)V", "a", "()V", "Ll/y4;", "b", "()Ll/y4;", "strategy", "e", "(Ll/y4;)V", "Ll/y4;", "currentStrategy", "Lcom/p1/mobile/putong/core/ui/banner/view/a;", "Lcom/p1/mobile/putong/core/ui/banner/view/a;", "strategyChain", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PrivilegeEntranceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AbstractC21509y4 currentStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C8457a strategyChain;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public C8456a privilegeEntranceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean hidden;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "", "Landroid/view/ViewGroup;", "root", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Landroid/view/ViewGroup;Lcom/p1/mobile/android/app/Act;)V", "a", "Landroid/view/ViewGroup;", "c", "()Landroid/view/ViewGroup;", "b", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "Ljava/text/NumberFormat;", "Ljava/text/NumberFormat;", "()Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8456a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ViewGroup root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final NumberFormat numberFormat;

        public C8456a(@NotNull ViewGroup viewGroup, @NotNull Act act) {
            viewGroup.getClass();
            act.getClass();
            this.root = viewGroup;
            this.act = act;
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.getClass();
            this.numberFormat = numberInstance;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Act getAct() {
            return this.act;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NumberFormat getNumberFormat() {
            return this.numberFormat;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ViewGroup getRoot() {
            return this.root;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.hidden = true;
        setOrientation(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m45581a() {
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC21509y4 m45582b() {
        C8457a c8457a = this.strategyChain;
        if (c8457a == null) {
            Intrinsics.m88391r("strategyChain");
            c8457a = null;
        }
        for (Map.Entry<String, AbstractC21509y4> entry : c8457a.m45590a().entrySet()) {
            if (entry.getValue().mo96813a()) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m45583c(@NotNull Act act) {
        act.getClass();
        this.privilegeEntranceInfo = new C8456a(this, act);
        m45581a();
        C8456a c8456a = this.privilegeEntranceInfo;
        if (c8456a == null) {
            Intrinsics.m88391r("privilegeEntranceInfo");
            c8456a = null;
        }
        this.strategyChain = new C8457a(c8456a);
    }

    /* JADX INFO: renamed from: d */
    public final void m45584d(boolean hidden) {
        this.hidden = hidden;
        AbstractC21509y4 abstractC21509y4 = this.currentStrategy;
        if (abstractC21509y4 != null) {
            abstractC21509y4.m214186d(hidden);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m45585e(AbstractC21509y4 strategy) {
        removeAllViews();
        C8456a c8456a = this.privilegeEntranceInfo;
        if (c8456a == null) {
            Intrinsics.m88391r("privilegeEntranceInfo");
            c8456a = null;
        }
        c8456a.getRoot().setBackgroundResource(0);
        if (strategy != null) {
            strategy.release();
        }
        this.currentStrategy = null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m45586f() {
        AbstractC21509y4 abstractC21509y4;
        AbstractC21509y4 abstractC21509y4M45582b = m45582b();
        if (abstractC21509y4M45582b == null) {
            return false;
        }
        if (!Intrinsics.m88377d(this.currentStrategy, abstractC21509y4M45582b)) {
            m45585e(this.currentStrategy);
            this.currentStrategy = abstractC21509y4M45582b;
            abstractC21509y4M45582b.mo96814b();
        }
        if (this.hidden || (abstractC21509y4 = this.currentStrategy) == null) {
            return true;
        }
        abstractC21509y4.mo96817m();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntranceView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntranceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
