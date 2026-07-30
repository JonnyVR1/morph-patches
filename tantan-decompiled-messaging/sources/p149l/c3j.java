package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class c3j extends RecyclerView.AbstractC0566d0 {
    public c3j(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static c3j m105029a(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(gbl0.m125198i());
        frameLayout.setSaveEnabled(false);
        return new c3j(frameLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public FrameLayout m105030b() {
        return (FrameLayout) this.itemView;
    }
}
