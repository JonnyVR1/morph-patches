package com.immomo.svgaplayer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 10})
public final class SVGADynamicEntity$setDynamicImage$runable$1 implements Runnable {
    final /* synthetic */ String $forKey;
    final /* synthetic */ Handler $handler;
    final /* synthetic */ String $url;
    final /* synthetic */ SVGADynamicEntity this$0;

    public SVGADynamicEntity$setDynamicImage$runable$1(SVGADynamicEntity sVGADynamicEntity, String str, Handler handler, String str2) {
        this.this$0 = sVGADynamicEntity;
        this.$url = str;
        this.$handler = handler;
        this.$forKey = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.$url).openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                uRLConnectionOpenConnection = null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            if (httpURLConnection != null) {
                httpURLConnection.setConnectTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                if (bitmapDecodeStream != null) {
                    this.$handler.post(new Runnable() { // from class: com.immomo.svgaplayer.SVGADynamicEntity$setDynamicImage$runable$1$$special$$inlined$let$lambda$2
                        @Override // java.lang.Runnable
                        public final void run() {
                            SVGADynamicEntity$setDynamicImage$runable$1 sVGADynamicEntity$setDynamicImage$runable$1 = this;
                            sVGADynamicEntity$setDynamicImage$runable$1.this$0.setDynamicImage(sVGADynamicEntity$setDynamicImage$runable$1.$forKey, bitmapDecodeStream);
                        }
                    });
                }
                httpURLConnection.getInputStream().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
