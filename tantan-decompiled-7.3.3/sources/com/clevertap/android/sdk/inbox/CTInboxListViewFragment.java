package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0602f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p153l.efc0;
import p153l.icc0;
import p153l.n2e;
import p153l.uhi;
import p153l.x9l0;
import p153l.xel0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxListViewFragment extends Fragment {

    /* JADX INFO: renamed from: C */
    LinearLayout f5305C;

    /* JADX INFO: renamed from: D */
    MediaPlayerRecyclerView f5306D;

    /* JADX INFO: renamed from: E */
    RecyclerView f5307E;

    /* JADX INFO: renamed from: F */
    private C1310f f5308F;

    /* JADX INFO: renamed from: G */
    CTInboxStyleConfig f5309G;

    /* JADX INFO: renamed from: I */
    private WeakReference<InterfaceC1302b> f5311I;

    /* JADX INFO: renamed from: J */
    private int f5312J;

    /* JADX INFO: renamed from: K */
    private n2e f5313K;

    /* JADX INFO: renamed from: z */
    CleverTapInstanceConfig f5314z;

    /* JADX INFO: renamed from: A */
    boolean f5303A = xel0.haveVideoPlayerSupport;

    /* JADX INFO: renamed from: B */
    ArrayList<CTInboxMessage> f5304B = new ArrayList<>();

    /* JADX INFO: renamed from: H */
    private boolean f5310H = true;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxListViewFragment$a */
    public class RunnableC1301a implements Runnable {
        public RunnableC1301a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CTInboxListViewFragment.this.f5306D.m6051Q();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxListViewFragment$b */
    public interface InterfaceC1302b {
        /* JADX INFO: renamed from: A */
        void mo6712A(Context context, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2);

        /* JADX INFO: renamed from: p */
        void mo6717p(Context context, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ boolean m6718V3(CTInboxListViewFragment cTInboxListViewFragment, SwipeRefreshLayout swipeRefreshLayout, View view) {
        View view2 = cTInboxListViewFragment.f5306D;
        if (view2 == null) {
            view2 = cTInboxListViewFragment.f5307E;
        }
        return view2 != null && view2.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m6719W3(CTInboxListViewFragment cTInboxListViewFragment, final SwipeRefreshLayout swipeRefreshLayout, final CleverTapAPI cleverTapAPI, final boolean z) {
        FragmentActivity activity = cTInboxListViewFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: l.jw3
            @Override // java.lang.Runnable
            public final void run() {
                CTInboxListViewFragment.m6720X3(swipeRefreshLayout, z, cleverTapAPI);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m6720X3(SwipeRefreshLayout swipeRefreshLayout, boolean z, CleverTapAPI cleverTapAPI) {
        swipeRefreshLayout.setRefreshing(false);
        if (z || !cleverTapAPI.m5851Y()) {
            return;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m6721Y3(final CTInboxListViewFragment cTInboxListViewFragment, final SwipeRefreshLayout swipeRefreshLayout) {
        final CleverTapAPI cleverTapAPIM5814U = CleverTapAPI.m5814U(cTInboxListViewFragment.requireContext().getApplicationContext(), cTInboxListViewFragment.f5314z);
        if (cleverTapAPIM5814U == null) {
            swipeRefreshLayout.setRefreshing(false);
        } else {
            cleverTapAPIM5814U.m5876y(new uhi() { // from class: l.iw3
                @Override // p153l.uhi
                /* JADX INFO: renamed from: a */
                public final void mo142368a(boolean z) {
                    CTInboxListViewFragment.m6719W3(this.f117241a, swipeRefreshLayout, cleverTapAPIM5814U, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b4 */
    private ArrayList<CTInboxMessage> m6722b4(ArrayList<CTInboxMessage> arrayList, String str) {
        ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
        for (CTInboxMessage cTInboxMessage : arrayList) {
            if (cTInboxMessage.m6739g() != null && cTInboxMessage.m6739g().size() > 0) {
                Iterator<String> it = cTInboxMessage.m6739g().iterator();
                while (it.hasNext()) {
                    if (it.next().equalsIgnoreCase(str)) {
                        arrayList2.add(cTInboxMessage);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m6723h4() {
        return this.f5312J <= 0;
    }

    /* JADX INFO: renamed from: i4 */
    private void m6724i4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("filter", null);
        CleverTapAPI cleverTapAPIM5814U = CleverTapAPI.m5814U(getActivity(), this.f5314z);
        if (cleverTapAPIM5814U != null) {
            Logger.m5927v("CTInboxListViewFragment:onAttach() called with: tabPosition = [" + this.f5312J + "], filter = [" + string + Constants.AES_SUFFIX);
            ArrayList<CTInboxMessage> arrayListM5845C = cleverTapAPIM5814U.m5845C();
            if (string != null) {
                arrayListM5845C = m6722b4(arrayListM5845C, string);
            }
            this.f5304B = arrayListM5845C;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m6725Z3(Bundle bundle, int i, int i2, HashMap<String, String> map, int i3) {
        InterfaceC1302b interfaceC1302bM6728d4 = m6728d4();
        if (interfaceC1302bM6728d4 != null) {
            interfaceC1302bM6728d4.mo6712A(getActivity().getBaseContext(), i2, this.f5304B.get(i), bundle, map, i3);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m6726a4(Bundle bundle, int i) {
        InterfaceC1302b interfaceC1302bM6728d4 = m6728d4();
        if (interfaceC1302bM6728d4 != null) {
            Logger.m5927v("CTInboxListViewFragment:didShow() called with: data = [" + bundle + "], position = [" + i + Constants.AES_SUFFIX);
            interfaceC1302bM6728d4.mo6717p(getActivity().getBaseContext(), this.f5304B.get(i), bundle);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m6727c4(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.replace(SignParameters.NEW_LINE, "").replace("\r", "")));
            if (getActivity() != null) {
                Utils.setPackageNameFromResolveInfoList(getActivity(), intent);
            }
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d4 */
    public InterfaceC1302b m6728d4() {
        InterfaceC1302b interfaceC1302b;
        try {
            interfaceC1302b = this.f5311I.get();
        } catch (Throwable unused) {
            interfaceC1302b = null;
        }
        if (interfaceC1302b == null) {
            Logger.m5927v("InboxListener is null for messages");
        }
        return interfaceC1302b;
    }

    /* JADX INFO: renamed from: e4 */
    public void m6729e4(int i, int i2, String str, JSONObject jSONObject, HashMap<String, String> map, int i3) {
        ArrayList<CTInboxMessage> arrayList = this.f5304B;
        try {
            if (jSONObject != null) {
                String strM6759m = arrayList.get(i).m6736d().get(0).m6759m(jSONObject);
                if (strM6759m.equalsIgnoreCase("url")) {
                    String strM6757k = this.f5304B.get(i).m6736d().get(0).m6757k(jSONObject);
                    if (strM6757k != null) {
                        m6727c4(strM6757k);
                    }
                } else if (strM6759m.contains(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION) && this.f5313K != null) {
                    this.f5313K.mo5913Q(this.f5304B.get(i).m6736d().get(0).m6768w(jSONObject));
                }
            } else {
                String strM6748a = arrayList.get(i).m6736d().get(0).m6748a();
                if (strM6748a != null) {
                    m6727c4(strM6748a);
                }
            }
            Bundle bundle = new Bundle();
            JSONObject jSONObjectM6741i = this.f5304B.get(i).m6741i();
            Iterator<String> itKeys = jSONObjectM6741i.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith(Constants.WZRK_PREFIX)) {
                    bundle.putString(next, jSONObjectM6741i.getString(next));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString(Constants.KEY_C2A, str);
            }
            m6725Z3(bundle, i, i2, map, i3);
        } catch (Throwable th) {
            Logger.m5919d("Error handling notification button click: " + th.getCause());
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m6730f4(int i, int i2) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObjectM6741i = this.f5304B.get(i).m6741i();
            Iterator<String> itKeys = jSONObjectM6741i.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith(Constants.WZRK_PREFIX)) {
                    bundle.putString(next, jSONObjectM6741i.getString(next));
                }
            }
            m6725Z3(bundle, i, i2, null, -1);
            m6727c4(this.f5304B.get(i).m6736d().get(i2).m6748a());
        } catch (Throwable th) {
            Logger.m5919d("Error handling notification button click: " + th.getCause());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m6731g4(InterfaceC1302b interfaceC1302b) {
        this.f5311I = new WeakReference<>(interfaceC1302b);
    }

    /* JADX INFO: renamed from: j4 */
    public void m6732j4(@NonNull final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setOnChildScrollUpCallback(new SwipeRefreshLayout.InterfaceC0701i() { // from class: l.gw3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0701i
            /* JADX INFO: renamed from: a */
            public final boolean mo4095a(SwipeRefreshLayout swipeRefreshLayout2, View view) {
                return CTInboxListViewFragment.m6718V3(this.f106725a, swipeRefreshLayout2, view);
            }
        });
        CleverTapAPI cleverTapAPIM5814U = CleverTapAPI.m5814U(requireContext().getApplicationContext(), this.f5314z);
        if (cleverTapAPIM5814U == null || !cleverTapAPIM5814U.m5851Y()) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.hw3
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
                /* JADX INFO: renamed from: p */
                public final void mo4096p() {
                    CTInboxListViewFragment.m6721Y3(this.f111862a, swipeRefreshLayout);
                }
            });
        } else {
            swipeRefreshLayout.setEnabled(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f5314z = (CleverTapInstanceConfig) arguments.getParcelable(Constants.KEY_CONFIG);
            this.f5309G = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.f5312J = arguments.getInt("position", -1);
            m6724i4();
            if (context instanceof CTInboxActivity) {
                m6731g4((InterfaceC1302b) getActivity());
            }
            if (context instanceof n2e) {
                this.f5313K = (n2e) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(efc0.f93762s, viewGroup, false);
        m6732j4((SwipeRefreshLayout) viewInflate.findViewById(icc0.f114373n));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(icc0.f114398z0);
        this.f5305C = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.f5309G.m5786c()));
        TextView textView = (TextView) viewInflate.findViewById(icc0.f114303A0);
        if (this.f5304B.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.f5309G.m5790g());
            textView.setTextColor(Color.parseColor(this.f5309G.m5791h()));
            return viewInflate;
        }
        textView.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f5308F = new C1310f(this.f5304B, this);
        if (!this.f5303A) {
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(icc0.f114305B0);
            this.f5307E = recyclerView;
            recyclerView.setVisibility(0);
            this.f5307E.setLayoutManager(linearLayoutManager);
            this.f5307E.addItemDecoration(new x9l0(18));
            this.f5307E.setItemAnimator(new C0602f());
            this.f5307E.setAdapter(this.f5308F);
            this.f5308F.notifyDataSetChanged();
            return viewInflate;
        }
        MediaPlayerRecyclerView mediaPlayerRecyclerView = new MediaPlayerRecyclerView(getActivity());
        this.f5306D = mediaPlayerRecyclerView;
        mediaPlayerRecyclerView.setVisibility(0);
        this.f5306D.setLayoutManager(linearLayoutManager);
        this.f5306D.addItemDecoration(new x9l0(18));
        this.f5306D.setItemAnimator(new C0602f());
        this.f5306D.setAdapter(this.f5308F);
        this.f5308F.notifyDataSetChanged();
        this.f5305C.addView(this.f5306D);
        if (this.f5310H && m6723h4()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1301a(), 1000L);
            this.f5310H = false;
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5306D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m6052U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5306D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m6049O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5306D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m6050P();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5306D;
        if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.f5306D.getLayoutManager().onSaveInstanceState());
        }
        RecyclerView recyclerView = this.f5307E;
        if (recyclerView == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        bundle.putParcelable("recyclerLayoutState", this.f5307E.getLayoutManager().onSaveInstanceState());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5306D;
            if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
                this.f5306D.getLayoutManager().onRestoreInstanceState(parcelable);
            }
            RecyclerView recyclerView = this.f5307E;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            this.f5307E.getLayoutManager().onRestoreInstanceState(parcelable);
        }
    }
}
