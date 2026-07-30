package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: renamed from: androidx.lifecycle.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m88121d2 = {"Landroidx/lifecycle/e;", "", "Landroidx/lifecycle/t$c;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/t$c;", "defaultViewModelProviderFactory", "Ll/cvb;", "getDefaultViewModelCreationExtras", "()Ll/cvb;", "defaultViewModelCreationExtras", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface InterfaceC0476e {
    @NotNull
    default cvb getDefaultViewModelCreationExtras() {
        return cvb.C16369b.INSTANCE;
    }

    @NotNull
    C0491t.c getDefaultViewModelProviderFactory();
}
