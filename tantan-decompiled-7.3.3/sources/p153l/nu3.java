package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class nu3 extends cf60 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<fw3> f143665a;

    /* JADX INFO: renamed from: b */
    private final Context f143666b;

    /* JADX INFO: renamed from: c */
    private final CTInboxMessage f143667c;

    /* JADX INFO: renamed from: d */
    private LayoutInflater f143668d;

    /* JADX INFO: renamed from: e */
    private final LinearLayout.LayoutParams f143669e;

    /* JADX INFO: renamed from: f */
    private final WeakReference<CTInboxListViewFragment> f143670f;

    /* JADX INFO: renamed from: g */
    private final int f143671g;

    /* JADX INFO: renamed from: h */
    private View f143672h;

    /* JADX INFO: renamed from: l.nu3$a */
    public class ViewOnClickListenerC18950a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f143673a;

        public ViewOnClickListenerC18950a(int i) {
            this.f143673a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CTInboxListViewFragment cTInboxListViewFragmentM164761l = nu3.this.m164761l();
            if (cTInboxListViewFragmentM164761l != null) {
                cTInboxListViewFragmentM164761l.m6730f4(nu3.this.f143671g, this.f143673a);
            }
        }
    }

    public nu3(Context context, CTInboxListViewFragment cTInboxListViewFragment, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i) {
        this.f143666b = context;
        this.f143670f = new WeakReference<>(cTInboxListViewFragment);
        this.f143665a = cTInboxMessage.m6734b();
        this.f143669e = layoutParams;
        this.f143667c = cTInboxMessage;
        this.f143671g = i;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f143665a.size();
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f143666b.getSystemService("layout_inflater");
        this.f143668d = layoutInflater;
        this.f143672h = layoutInflater.inflate(efc0.f93758o, viewGroup, false);
        try {
            if (this.f143667c.m6738f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f45292l)) {
                m164760k((ImageView) this.f143672h.findViewById(icc0.f114354d0), this.f143672h, i, viewGroup);
            } else {
                boolean zEqualsIgnoreCase = this.f143667c.m6738f().equalsIgnoreCase("p");
                View view = this.f143672h;
                if (zEqualsIgnoreCase) {
                    m164760k((ImageView) view.findViewById(icc0.f114327M0), this.f143672h, i, viewGroup);
                } else {
                    ImageView imageView = (ImageView) view.findViewById(icc0.f114383s);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    m164760k(imageView, this.f143672h, i, viewGroup);
                }
            }
        } catch (NoClassDefFoundError unused) {
            Logger.m5919d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        return this.f143672h;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: k */
    public void m164760k(ImageView imageView, View view, int i, ViewGroup viewGroup) {
        imageView.setVisibility(0);
        String contentDescription = this.f143665a.get(i).getContentDescription();
        if (contentDescription.isEmpty()) {
            contentDescription = this.f143666b.getString(R$string.f4864e) + (i + 1);
        }
        imageView.setContentDescription(contentDescription);
        try {
            ComponentCallbacks2C1057a.m5325t(imageView.getContext()).m156821t(this.f143665a.get(i).getUrl()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f143666b, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f143666b, Constants.IMAGE_PLACEHOLDER))).m95652x0(imageView);
        } catch (NoSuchMethodError unused) {
            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
            ComponentCallbacks2C1057a.m5325t(imageView.getContext()).m156821t(this.f143665a.get(i).getUrl()).m95652x0(imageView);
        }
        viewGroup.addView(view, this.f143669e);
        view.setOnClickListener(new ViewOnClickListenerC18950a(i));
    }

    /* JADX INFO: renamed from: l */
    public CTInboxListViewFragment m164761l() {
        return this.f143670f.get();
    }
}
