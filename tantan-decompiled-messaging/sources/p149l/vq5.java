package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes3.dex */
public final class vq5 {
    /* JADX INFO: renamed from: b */
    public static void m199450b(final Message message, VImage vImage, AutoVDraweeView autoVDraweeView, VText_NoTopPadding vText_NoTopPadding, final Act act) {
        if (message == null) {
            return;
        }
        int i = xp5.m210469i(message) ? c3c0.f78513F0 : c3c0.f78495D0;
        if (vImage.getTag() == null || ((Integer) vImage.getTag()).intValue() != i) {
            vImage.setImageResource(i);
            vImage.setTag(Integer.valueOf(i));
        }
        if (!vwb.m200296J(message.media) && message.media.get(0).cover() != null && !TextUtils.isEmpty(message.media.get(0).cover().url)) {
            final Media media = message.media.get(0);
            String str = media.cover().url;
            if (!TextUtils.equals((CharSequence) autoVDraweeView.getTag(), str)) {
                autoVDraweeView.setImageUrl(str);
                autoVDraweeView.setZoomAnimationKey(n000.m157189h(message, media.cover()));
                autoVDraweeView.setTag(str);
            }
            autoVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.uq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreModule.m29935P().m94651a().mo158413n1(act, message, media);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            vText_NoTopPadding.setText(message.value);
        }
        xdl0.m208344M(vText_NoTopPadding, z);
    }
}
