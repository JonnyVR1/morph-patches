package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.AbstractC0789a;
import com.p051p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.aui;
import p153l.fui;
import p153l.g06;
import p153l.j06;
import p153l.l06;
import p153l.mjq0;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m88121d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", p7f.GPS_DIRECTION_TRUE, "Ll/g06;", "Ll/j06;", "tracker", "<init>", "(Ll/j06;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "Ll/l06;", "constraints", "Ll/aui;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/l06;)Ll/aui;", "Ll/mjq0;", "workSpec", "a", "(Ll/mjq0;)Z", "Ll/j06;", "", "e", "()I", "getReason$annotations", "()V", Reason.TYPE, "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class BaseConstraintController<T> implements g06 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final j06<T> tracker;

    public BaseConstraintController(@NotNull j06<T> j06Var) {
        j06Var.getClass();
        this.tracker = j06Var;
    }

    @Override // p153l.g06
    /* JADX INFO: renamed from: a */
    public boolean mo4574a(@NotNull mjq0 workSpec) {
        workSpec.getClass();
        return mo4576c(workSpec) && mo4589f(this.tracker.mo100316d());
    }

    @Override // p153l.g06
    @NotNull
    /* JADX INFO: renamed from: b */
    public aui<AbstractC0789a> mo4575b(@NotNull l06 constraints) {
        constraints.getClass();
        return fui.m127481e(new BaseConstraintController$track$1(this, null));
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo4588e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo4589f(T value);
}
