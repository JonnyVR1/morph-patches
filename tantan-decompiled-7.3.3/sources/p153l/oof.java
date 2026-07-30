package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes11.dex */
public class oof extends pej0 {

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior f148350f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f148351g;

    public oof(@NonNull Context context) {
        super(context);
        this.f148351g = new C19188a();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f148350f = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f148350f.setBottomSheetCallback(this.f148351g);
    }

    /* JADX INFO: renamed from: l.oof$a */
    public class C19188a extends BottomSheetBehavior.BottomSheetCallback {
        public C19188a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                oof.this.f148350f.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
