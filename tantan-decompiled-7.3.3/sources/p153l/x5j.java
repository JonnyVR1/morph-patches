package p153l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class x5j extends RecyclerView.AbstractC0569e0 {
    public x5j(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static x5j m209386a(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(kkl0.m150161i());
        frameLayout.setSaveEnabled(false);
        return new x5j(frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public FrameLayout m209387b() {
        return (FrameLayout) this.itemView;
    }
}
