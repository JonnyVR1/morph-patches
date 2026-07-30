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
import androidx.recyclerview.widget.C0600f;
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
import p149l.a7c0;
import p149l.c4c0;
import p149l.s0l0;
import p149l.t5l0;
import p149l.yei;
import p149l.z0e;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxListViewFragment extends Fragment {

    /* JADX INFO: renamed from: C */
    LinearLayout f5268C;

    /* JADX INFO: renamed from: D */
    MediaPlayerRecyclerView f5269D;

    /* JADX INFO: renamed from: E */
    RecyclerView f5270E;

    /* JADX INFO: renamed from: F */
    private C1287f f5271F;

    /* JADX INFO: renamed from: G */
    CTInboxStyleConfig f5272G;

    /* JADX INFO: renamed from: I */
    private WeakReference<InterfaceC1279b> f5274I;

    /* JADX INFO: renamed from: J */
    private int f5275J;

    /* JADX INFO: renamed from: K */
    private z0e f5276K;

    /* JADX INFO: renamed from: z */
    CleverTapInstanceConfig f5277z;

    /* JADX INFO: renamed from: A */
    boolean f5266A = t5l0.haveVideoPlayerSupport;

    /* JADX INFO: renamed from: B */
    ArrayList<CTInboxMessage> f5267B = new ArrayList<>();

    /* JADX INFO: renamed from: H */
    private boolean f5273H = true;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxListViewFragment$a */
    public class RunnableC1278a implements Runnable {
        public RunnableC1278a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CTInboxListViewFragment.this.f5269D.m5997Q();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxListViewFragment$b */
    public interface InterfaceC1279b {
        /* JADX INFO: renamed from: A */
        void mo6658A(Context context, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2);

        /* JADX INFO: renamed from: q */
        void mo6663q(Context context, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ boolean m6664V3(CTInboxListViewFragment cTInboxListViewFragment, SwipeRefreshLayout swipeRefreshLayout, View view) {
        View view2 = cTInboxListViewFragment.f5269D;
        if (view2 == null) {
            view2 = cTInboxListViewFragment.f5270E;
        }
        return view2 != null && view2.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m6665W3(CTInboxListViewFragment cTInboxListViewFragment, final SwipeRefreshLayout swipeRefreshLayout, final CleverTapAPI cleverTapAPI, final boolean z) {
        FragmentActivity activity = cTInboxListViewFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: l.kv3
            @Override // java.lang.Runnable
            public final void run() {
                CTInboxListViewFragment.m6666X3(swipeRefreshLayout, z, cleverTapAPI);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m6666X3(SwipeRefreshLayout swipeRefreshLayout, boolean z, CleverTapAPI cleverTapAPI) {
        swipeRefreshLayout.setRefreshing(false);
        if (z || !cleverTapAPI.m5797Y()) {
            return;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m6667Y3(final CTInboxListViewFragment cTInboxListViewFragment, final SwipeRefreshLayout swipeRefreshLayout) {
        final CleverTapAPI cleverTapAPIM5760U = CleverTapAPI.m5760U(cTInboxListViewFragment.requireContext().getApplicationContext(), cTInboxListViewFragment.f5277z);
        if (cleverTapAPIM5760U == null) {
            swipeRefreshLayout.setRefreshing(false);
        } else {
            cleverTapAPIM5760U.m5822y(new yei() { // from class: l.jv3
                @Override // p149l.yei
                /* JADX INFO: renamed from: a */
                public final void mo143396a(boolean z) {
                    CTInboxListViewFragment.m6665W3(this.f119850a, swipeRefreshLayout, cleverTapAPIM5760U, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b4 */
    private ArrayList<CTInboxMessage> m6668b4(ArrayList<CTInboxMessage> arrayList, String str) {
        ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
        for (CTInboxMessage cTInboxMessage : arrayList) {
            if (cTInboxMessage.m6685g() != null && cTInboxMessage.m6685g().size() > 0) {
                Iterator<String> it = cTInboxMessage.m6685g().iterator();
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
    private boolean m6669h4() {
        return this.f5275J <= 0;
    }

    /* JADX INFO: renamed from: i4 */
    private void m6670i4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("filter", null);
        CleverTapAPI cleverTapAPIM5760U = CleverTapAPI.m5760U(getActivity(), this.f5277z);
        if (cleverTapAPIM5760U != null) {
            Logger.m5873v("CTInboxListViewFragment:onAttach() called with: tabPosition = [" + this.f5275J + "], filter = [" + string + Constants.AES_SUFFIX);
            ArrayList<CTInboxMessage> arrayListM5791C = cleverTapAPIM5760U.m5791C();
            if (string != null) {
                arrayListM5791C = m6668b4(arrayListM5791C, string);
            }
            this.f5267B = arrayListM5791C;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m6671Z3(Bundle bundle, int i, int i2, HashMap<String, String> map, int i3) {
        InterfaceC1279b interfaceC1279bM6674d4 = m6674d4();
        if (interfaceC1279bM6674d4 != null) {
            interfaceC1279bM6674d4.mo6658A(getActivity().getBaseContext(), i2, this.f5267B.get(i), bundle, map, i3);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void m6672a4(Bundle bundle, int i) {
        InterfaceC1279b interfaceC1279bM6674d4 = m6674d4();
        if (interfaceC1279bM6674d4 != null) {
            Logger.m5873v("CTInboxListViewFragment:didShow() called with: data = [" + bundle + "], position = [" + i + Constants.AES_SUFFIX);
            interfaceC1279bM6674d4.mo6663q(getActivity().getBaseContext(), this.f5267B.get(i), bundle);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m6673c4(String str) {
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
    public InterfaceC1279b m6674d4() {
        InterfaceC1279b interfaceC1279b;
        try {
            interfaceC1279b = this.f5274I.get();
        } catch (Throwable unused) {
            interfaceC1279b = null;
        }
        if (interfaceC1279b == null) {
            Logger.m5873v("InboxListener is null for messages");
        }
        return interfaceC1279b;
    }

    /* JADX INFO: renamed from: e4 */
    public void m6675e4(int i, int i2, String str, JSONObject jSONObject, HashMap<String, String> map, int i3) {
        ArrayList<CTInboxMessage> arrayList = this.f5267B;
        try {
            if (jSONObject != null) {
                String strM6705m = arrayList.get(i).m6682d().get(0).m6705m(jSONObject);
                if (strM6705m.equalsIgnoreCase("url")) {
                    String strM6703k = this.f5267B.get(i).m6682d().get(0).m6703k(jSONObject);
                    if (strM6703k != null) {
                        m6673c4(strM6703k);
                    }
                } else if (strM6705m.contains(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION) && this.f5276K != null) {
                    this.f5276K.mo5858P(this.f5267B.get(i).m6682d().get(0).m6714w(jSONObject));
                }
            } else {
                String strM6694a = arrayList.get(i).m6682d().get(0).m6694a();
                if (strM6694a != null) {
                    m6673c4(strM6694a);
                }
            }
            Bundle bundle = new Bundle();
            JSONObject jSONObjectM6687i = this.f5267B.get(i).m6687i();
            Iterator<String> itKeys = jSONObjectM6687i.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith(Constants.WZRK_PREFIX)) {
                    bundle.putString(next, jSONObjectM6687i.getString(next));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString(Constants.KEY_C2A, str);
            }
            m6671Z3(bundle, i, i2, map, i3);
        } catch (Throwable th) {
            Logger.m5865d("Error handling notification button click: " + th.getCause());
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m6676f4(int i, int i2) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObjectM6687i = this.f5267B.get(i).m6687i();
            Iterator<String> itKeys = jSONObjectM6687i.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith(Constants.WZRK_PREFIX)) {
                    bundle.putString(next, jSONObjectM6687i.getString(next));
                }
            }
            m6671Z3(bundle, i, i2, null, -1);
            m6673c4(this.f5267B.get(i).m6682d().get(i2).m6694a());
        } catch (Throwable th) {
            Logger.m5865d("Error handling notification button click: " + th.getCause());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m6677g4(InterfaceC1279b interfaceC1279b) {
        this.f5274I = new WeakReference<>(interfaceC1279b);
    }

    /* JADX INFO: renamed from: j4 */
    public void m6678j4(@NonNull final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setOnChildScrollUpCallback(new SwipeRefreshLayout.InterfaceC0699i() { // from class: l.hv3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0699i
            /* JADX INFO: renamed from: a */
            public final boolean mo4093a(SwipeRefreshLayout swipeRefreshLayout2, View view) {
                return CTInboxListViewFragment.m6664V3(this.f109611a, swipeRefreshLayout2, view);
            }
        });
        CleverTapAPI cleverTapAPIM5760U = CleverTapAPI.m5760U(requireContext().getApplicationContext(), this.f5277z);
        if (cleverTapAPIM5760U == null || !cleverTapAPIM5760U.m5797Y()) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.iv3
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
                /* JADX INFO: renamed from: q */
                public final void mo4094q() {
                    CTInboxListViewFragment.m6667Y3(this.f115084a, swipeRefreshLayout);
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
            this.f5277z = (CleverTapInstanceConfig) arguments.getParcelable(Constants.KEY_CONFIG);
            this.f5272G = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.f5275J = arguments.getInt("position", -1);
            m6670i4();
            if (context instanceof CTInboxActivity) {
                m6677g4((InterfaceC1279b) getActivity());
            }
            if (context instanceof z0e) {
                this.f5276K = (z0e) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7c0.f67910s, viewGroup, false);
        m6678j4((SwipeRefreshLayout) viewInflate.findViewById(c4c0.f79237n));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(c4c0.f79262z0);
        this.f5268C = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.f5272G.m5732c()));
        TextView textView = (TextView) viewInflate.findViewById(c4c0.f79167A0);
        if (this.f5267B.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.f5272G.m5736g());
            textView.setTextColor(Color.parseColor(this.f5272G.m5737h()));
            return viewInflate;
        }
        textView.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f5271F = new C1287f(this.f5267B, this);
        if (!this.f5266A) {
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c4c0.f79169B0);
            this.f5270E = recyclerView;
            recyclerView.setVisibility(0);
            this.f5270E.setLayoutManager(linearLayoutManager);
            this.f5270E.addItemDecoration(new s0l0(18));
            this.f5270E.setItemAnimator(new C0600f());
            this.f5270E.setAdapter(this.f5271F);
            this.f5271F.notifyDataSetChanged();
            return viewInflate;
        }
        MediaPlayerRecyclerView mediaPlayerRecyclerView = new MediaPlayerRecyclerView(getActivity());
        this.f5269D = mediaPlayerRecyclerView;
        mediaPlayerRecyclerView.setVisibility(0);
        this.f5269D.setLayoutManager(linearLayoutManager);
        this.f5269D.addItemDecoration(new s0l0(18));
        this.f5269D.setItemAnimator(new C0600f());
        this.f5269D.setAdapter(this.f5271F);
        this.f5271F.notifyDataSetChanged();
        this.f5268C.addView(this.f5269D);
        if (this.f5273H && m6669h4()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1278a(), 1000L);
            this.f5273H = false;
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5269D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m5998U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5269D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m5995O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5269D;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.m5996P();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5269D;
        if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.f5269D.getLayoutManager().onSaveInstanceState());
        }
        RecyclerView recyclerView = this.f5270E;
        if (recyclerView == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        bundle.putParcelable("recyclerLayoutState", this.f5270E.getLayoutManager().onSaveInstanceState());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            MediaPlayerRecyclerView mediaPlayerRecyclerView = this.f5269D;
            if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.getLayoutManager() != null) {
                this.f5269D.getLayoutManager().onRestoreInstanceState(parcelable);
            }
            RecyclerView recyclerView = this.f5270E;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            this.f5270E.getLayoutManager().onRestoreInstanceState(parcelable);
        }
    }
}
