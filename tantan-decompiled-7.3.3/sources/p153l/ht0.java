package p153l;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public class ht0 extends gt0 {

    /* JADX INFO: renamed from: m */
    public static final Property<View, Integer> f111497m;

    /* JADX INFO: renamed from: n */
    public static final Property<View, Integer> f111498n;

    /* JADX INFO: renamed from: l.ht0$a */
    public class C17575a extends Property<View, Integer> {
        public C17575a(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.ht0$b */
    public class C17576b extends Property<View, Integer> {
        public C17576b(Class cls, String str) {
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
        f111497m = new C17575a(cls, "viewHeight");
        f111498n = new C17576b(cls, "viewWidth");
    }
}
