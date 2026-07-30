package com.p046p1.mobile.putong.p065ui.datepicker.p067ex;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.p065ui.datepicker.WheelView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ck0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelAmPmView;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "T0", "()V", "Ll/ck0;", "value", "M1", "Ll/ck0;", "getAmPmTextHandler", "()Ll/ck0;", "setAmPmTextHandler", "(Ll/ck0;)V", "amPmTextHandler", "a", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class WheelAmPmView extends WheelView {

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    @NotNull
    public ck0 amPmTextHandler;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.ex.WheelAmPmView$a */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelAmPmView$a;", "Ll/ck0;", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "b", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C13106a implements ck0 {
        @Override // p149l.ck0
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo79536a(@NotNull Context context) {
            context.getClass();
            return "上午";
        }

        @Override // p149l.ck0
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo79537b(@NotNull Context context) {
            context.getClass();
            return "下午";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelAmPmView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.amPmTextHandler = new C13106a();
        m79535T0();
    }

    /* JADX INFO: renamed from: T0 */
    private final void m79535T0() {
        ArrayList arrayList = new ArrayList();
        ck0 ck0Var = this.amPmTextHandler;
        Context context = getContext();
        context.getClass();
        arrayList.add(ck0Var.mo79536a(context));
        ck0 ck0Var2 = this.amPmTextHandler;
        Context context2 = getContext();
        context2.getClass();
        arrayList.add(ck0Var2.mo79537b(context2));
        setData(arrayList);
    }

    @NotNull
    public final ck0 getAmPmTextHandler() {
        return this.amPmTextHandler;
    }

    public final void setAmPmTextHandler(@NotNull ck0 ck0Var) {
        ck0Var.getClass();
        if (Intrinsics.m87488d(ck0Var, this.amPmTextHandler)) {
            return;
        }
        this.amPmTextHandler = ck0Var;
        m79535T0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelAmPmView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelAmPmView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelAmPmView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
