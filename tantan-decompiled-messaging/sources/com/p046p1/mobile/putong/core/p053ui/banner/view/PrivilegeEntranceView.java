package com.p046p1.mobile.putong.core.p053ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
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
import p149l.AbstractC15528a5;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006$"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "c", "(Lcom/p1/mobile/android/app/Act;)V", "", "f", "()Z", "hidden", Constants.INAPP_DATA_TAG, "(Z)V", "a", "()V", "Ll/a5;", "b", "()Ll/a5;", "strategy", "e", "(Ll/a5;)V", "Ll/a5;", "currentStrategy", "Lcom/p1/mobile/putong/core/ui/banner/view/a;", "Lcom/p1/mobile/putong/core/ui/banner/view/a;", "strategyChain", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "Z", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PrivilegeEntranceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AbstractC15528a5 currentStrategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C8294a strategyChain;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public C8293a privilegeEntranceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean hidden;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "", "Landroid/view/ViewGroup;", "root", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Landroid/view/ViewGroup;Lcom/p1/mobile/android/app/Act;)V", "a", "Landroid/view/ViewGroup;", "c", "()Landroid/view/ViewGroup;", "b", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "Ljava/text/NumberFormat;", "Ljava/text/NumberFormat;", "()Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8293a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ViewGroup root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final NumberFormat numberFormat;

        public C8293a(@NotNull ViewGroup viewGroup, @NotNull Act act) {
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
    public final void m44398a() {
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC15528a5 m44399b() {
        C8294a c8294a = this.strategyChain;
        if (c8294a == null) {
            Intrinsics.m87502r("strategyChain");
            c8294a = null;
        }
        for (Map.Entry<String, AbstractC15528a5> entry : c8294a.m44407a().entrySet()) {
            if (entry.getValue().mo94540a()) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m44400c(@NotNull Act act) {
        act.getClass();
        this.privilegeEntranceInfo = new C8293a(this, act);
        m44398a();
        C8293a c8293a = this.privilegeEntranceInfo;
        if (c8293a == null) {
            Intrinsics.m87502r("privilegeEntranceInfo");
            c8293a = null;
        }
        this.strategyChain = new C8294a(c8293a);
    }

    /* JADX INFO: renamed from: d */
    public final void m44401d(boolean hidden) {
        this.hidden = hidden;
        AbstractC15528a5 abstractC15528a5 = this.currentStrategy;
        if (abstractC15528a5 != null) {
            abstractC15528a5.m94950d(hidden);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m44402e(AbstractC15528a5 strategy) {
        removeAllViews();
        C8293a c8293a = this.privilegeEntranceInfo;
        if (c8293a == null) {
            Intrinsics.m87502r("privilegeEntranceInfo");
            c8293a = null;
        }
        c8293a.getRoot().setBackgroundResource(0);
        if (strategy != null) {
            strategy.release();
        }
        this.currentStrategy = null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m44403f() {
        AbstractC15528a5 abstractC15528a5;
        AbstractC15528a5 abstractC15528a5M44399b = m44399b();
        if (abstractC15528a5M44399b == null) {
            return false;
        }
        if (!Intrinsics.m87488d(this.currentStrategy, abstractC15528a5M44399b)) {
            m44402e(this.currentStrategy);
            this.currentStrategy = abstractC15528a5M44399b;
            abstractC15528a5M44399b.mo94541b();
        }
        if (this.hidden || (abstractC15528a5 = this.currentStrategy) == null) {
            return true;
        }
        abstractC15528a5.mo94544m();
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
