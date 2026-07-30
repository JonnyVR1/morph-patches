package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ot3 extends w660 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<gv3> f145533a;

    /* JADX INFO: renamed from: b */
    private final Context f145534b;

    /* JADX INFO: renamed from: c */
    private final CTInboxMessage f145535c;

    /* JADX INFO: renamed from: d */
    private LayoutInflater f145536d;

    /* JADX INFO: renamed from: e */
    private final LinearLayout.LayoutParams f145537e;

    /* JADX INFO: renamed from: f */
    private final WeakReference<CTInboxListViewFragment> f145538f;

    /* JADX INFO: renamed from: g */
    private final int f145539g;

    /* JADX INFO: renamed from: h */
    private View f145540h;

    /* JADX INFO: renamed from: l.ot3$a */
    public class ViewOnClickListenerC19031a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f145541a;

        public ViewOnClickListenerC19031a(int i) {
            this.f145541a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CTInboxListViewFragment cTInboxListViewFragmentM165928l = ot3.this.m165928l();
            if (cTInboxListViewFragmentM165928l != null) {
                cTInboxListViewFragmentM165928l.m6676f4(ot3.this.f145539g, this.f145541a);
            }
        }
    }

    public ot3(Context context, CTInboxListViewFragment cTInboxListViewFragment, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i) {
        this.f145534b = context;
        this.f145538f = new WeakReference<>(cTInboxListViewFragment);
        this.f145533a = cTInboxMessage.m6680b();
        this.f145537e = layoutParams;
        this.f145535c = cTInboxMessage;
        this.f145539g = i;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f145533a.size();
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f145534b.getSystemService("layout_inflater");
        this.f145536d = layoutInflater;
        this.f145540h = layoutInflater.inflate(a7c0.f67906o, viewGroup, false);
        try {
            if (this.f145535c.m6684f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f44444l)) {
                m165927k((ImageView) this.f145540h.findViewById(c4c0.f79218d0), this.f145540h, i, viewGroup);
            } else {
                boolean zEqualsIgnoreCase = this.f145535c.m6684f().equalsIgnoreCase("p");
                View view = this.f145540h;
                if (zEqualsIgnoreCase) {
                    m165927k((ImageView) view.findViewById(c4c0.f79191M0), this.f145540h, i, viewGroup);
                } else {
                    ImageView imageView = (ImageView) view.findViewById(c4c0.f79247s);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    m165927k(imageView, this.f145540h, i, viewGroup);
                }
            }
        } catch (NoClassDefFoundError unused) {
            Logger.m5865d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        return this.f145540h;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: k */
    public void m165927k(ImageView imageView, View view, int i, ViewGroup viewGroup) {
        imageView.setVisibility(0);
        String contentDescription = this.f145533a.get(i).getContentDescription();
        if (contentDescription.isEmpty()) {
            contentDescription = this.f145534b.getString(R$string.f4827e) + (i + 1);
        }
        imageView.setContentDescription(contentDescription);
        try {
            ComponentCallbacks2C1053a.m5316u(imageView.getContext()).m143276t(this.f145533a.get(i).getUrl()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f145534b, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f145534b, Constants.IMAGE_PLACEHOLDER))).m199993w0(imageView);
        } catch (NoSuchMethodError unused) {
            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
            ComponentCallbacks2C1053a.m5316u(imageView.getContext()).m143276t(this.f145533a.get(i).getUrl()).m199993w0(imageView);
        }
        viewGroup.addView(view, this.f145537e);
        view.setOnClickListener(new ViewOnClickListenerC19031a(i));
    }

    /* JADX INFO: renamed from: l */
    public CTInboxListViewFragment m165928l() {
        return this.f145538f.get();
    }
}
