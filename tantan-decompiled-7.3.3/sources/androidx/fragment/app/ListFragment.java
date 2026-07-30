package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.azk0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* JADX INFO: renamed from: C */
    public ListAdapter f1964C;

    /* JADX INFO: renamed from: D */
    public ListView f1965D;

    /* JADX INFO: renamed from: E */
    public View f1966E;

    /* JADX INFO: renamed from: F */
    public TextView f1967F;

    /* JADX INFO: renamed from: G */
    public View f1968G;

    /* JADX INFO: renamed from: H */
    public View f1969H;

    /* JADX INFO: renamed from: I */
    public CharSequence f1970I;

    /* JADX INFO: renamed from: J */
    public boolean f1971J;

    /* JADX INFO: renamed from: z */
    public final Handler f1972z = new Handler();

    /* JADX INFO: renamed from: A */
    public final Runnable f1962A = new RunnableC0411a();

    /* JADX INFO: renamed from: B */
    public final AdapterView.OnItemClickListener f1963B = new C0412b();

    /* JADX INFO: renamed from: androidx.fragment.app.ListFragment$a */
    public class RunnableC0411a implements Runnable {
        public RunnableC0411a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f1965D;
            listView.focusableViewAvailable(listView);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ListFragment$b */
    public class C0412b implements AdapterView.OnItemClickListener {
        public C0412b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.m2661W3((ListView) adapterView, view, i, j);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m2660V3() {
        if (this.f1965D != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            wtq0.m207906a("Content view not yet created");
            return;
        }
        if (view instanceof ListView) {
            this.f1965D = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.f1967F = textView;
            if (textView == null) {
                this.f1966E = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f1968G = view.findViewById(16711682);
            this.f1969H = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    azk0.m101074a("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    return;
                } else {
                    azk0.m101074a("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    return;
                }
            }
            ListView listView = (ListView) viewFindViewById;
            this.f1965D = listView;
            View view2 = this.f1966E;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f1970I;
                if (charSequence != null) {
                    this.f1967F.setText(charSequence);
                    this.f1965D.setEmptyView(this.f1967F);
                }
            }
        }
        this.f1971J = true;
        this.f1965D.setOnItemClickListener(this.f1963B);
        ListAdapter listAdapter = this.f1964C;
        if (listAdapter != null) {
            this.f1964C = null;
            m2662X3(listAdapter);
        } else if (this.f1968G != null) {
            m2663Y3(false, false);
        }
        this.f1972z.post(this.f1962A);
    }

    /* JADX INFO: renamed from: W3 */
    public void m2661W3(@NonNull ListView listView, @NonNull View view, int i, long j) {
    }

    /* JADX INFO: renamed from: X3 */
    public void m2662X3(@Nullable ListAdapter listAdapter) {
        boolean z = this.f1964C != null;
        this.f1964C = listAdapter;
        ListView listView = this.f1965D;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f1971J || z) {
                return;
            }
            m2663Y3(true, requireView().getWindowToken() != null);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m2663Y3(boolean z, boolean z2) {
        m2660V3();
        View view = this.f1968G;
        if (view == null) {
            wtq0.m207906a("Can't be used with a custom content view");
            return;
        }
        if (this.f1971J == z) {
            return;
        }
        this.f1971J = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f1969H.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f1969H.clearAnimation();
            }
            this.f1968G.setVisibility(8);
            this.f1969H.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f1969H.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f1969H.clearAnimation();
        }
        this.f1968G.setVisibility(0);
        this.f1969H.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f1972z.removeCallbacks(this.f1962A);
        this.f1965D = null;
        this.f1971J = false;
        this.f1969H = null;
        this.f1968G = null;
        this.f1966E = null;
        this.f1967F = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m2660V3();
    }
}
