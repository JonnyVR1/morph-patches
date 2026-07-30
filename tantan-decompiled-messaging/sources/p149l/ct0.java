package p149l;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public class ct0 extends bt0 {

    /* JADX INFO: renamed from: m */
    public static final Property<View, Integer> f82447m;

    /* JADX INFO: renamed from: n */
    public static final Property<View, Integer> f82448n;

    /* JADX INFO: renamed from: l.ct0$a */
    public class C16240a extends Property<View, Integer> {
        public C16240a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.ct0$b */
    public class C16241b extends Property<View, Integer> {
        public C16241b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f82447m = new C16240a(cls, "viewHeight");
        f82448n = new C16241b(cls, "viewWidth");
    }
}
