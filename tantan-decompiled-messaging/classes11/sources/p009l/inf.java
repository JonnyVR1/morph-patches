package p009l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l.l5j0;
import l.p4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class inf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior f14714f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f14715g;

    public inf(@NonNull Context context) {
        super(context);
        this.f14715g = new C0960a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f14714f = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f14714f.setBottomSheetCallback(this.f14715g);
    }

    /* JADX INFO: renamed from: l.inf$a */
    public class C0960a extends BottomSheetBehavior.BottomSheetCallback {
        public C0960a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                inf.this.f14714f.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
