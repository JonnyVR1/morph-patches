package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes11.dex */
public class inf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior f114012f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f114013g;

    public inf(@NonNull Context context) {
        super(context);
        this.f114013g = new C17579a();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f114012f = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f114012f.setBottomSheetCallback(this.f114013g);
    }

    /* JADX INFO: renamed from: l.inf$a */
    public class C17579a extends BottomSheetBehavior.BottomSheetCallback {
        public C17579a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                inf.this.f114012f.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
