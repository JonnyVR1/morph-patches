package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.AbstractC0787a;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.bz5;
import p149l.eri;
import p149l.ez5;
import p149l.gz5;
import p149l.haq0;
import p149l.j6f;
import p149l.jri;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", j6f.GPS_DIRECTION_TRUE, "Ll/bz5;", "Ll/ez5;", "tracker", "<init>", "(Ll/ez5;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "Ll/gz5;", "constraints", "Ll/eri;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/gz5;)Ll/eri;", "Ll/haq0;", "workSpec", "a", "(Ll/haq0;)Z", "Ll/ez5;", "", "e", "()I", "getReason$annotations", "()V", Reason.TYPE, "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class BaseConstraintController<T> implements bz5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ez5<T> tracker;

    public BaseConstraintController(@NotNull ez5<T> ez5Var) {
        ez5Var.getClass();
        this.tracker = ez5Var;
    }

    @Override // p149l.bz5
    /* JADX INFO: renamed from: a */
    public boolean mo4572a(@NotNull haq0 workSpec) {
        workSpec.getClass();
        return mo4574c(workSpec) && mo4587f(this.tracker.mo118843d());
    }

    @Override // p149l.bz5
    @NotNull
    /* JADX INFO: renamed from: b */
    public eri<AbstractC0787a> mo4573b(@NotNull gz5 constraints) {
        constraints.getClass();
        return jri.m142946e(new BaseConstraintController$track$1(this, null));
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo4586e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo4587f(T value);
}
