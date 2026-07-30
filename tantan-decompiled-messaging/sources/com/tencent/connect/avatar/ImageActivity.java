package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.p105b.C14363e;
import com.tencent.open.p105b.C14366h;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class ImageActivity extends Activity {

    /* JADX INFO: renamed from: a */
    RelativeLayout f57116a;

    /* JADX INFO: renamed from: b */
    private QQToken f57117b;

    /* JADX INFO: renamed from: c */
    private String f57118c;

    /* JADX INFO: renamed from: d */
    private Handler f57119d;

    /* JADX INFO: renamed from: e */
    private C13822c f57120e;

    /* JADX INFO: renamed from: f */
    private Button f57121f;

    /* JADX INFO: renamed from: g */
    private Button f57122g;

    /* JADX INFO: renamed from: h */
    private C13821b f57123h;

    /* JADX INFO: renamed from: i */
    private TextView f57124i;

    /* JADX INFO: renamed from: j */
    private ProgressBar f57125j;

    /* JADX INFO: renamed from: r */
    private String f57133r;

    /* JADX INFO: renamed from: s */
    private Bitmap f57134s;

    /* JADX INFO: renamed from: k */
    private int f57126k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f57127l = false;

    /* JADX INFO: renamed from: m */
    private long f57128m = 0;

    /* JADX INFO: renamed from: n */
    private int f57129n = 0;

    /* JADX INFO: renamed from: o */
    private final int f57130o = 640;

    /* JADX INFO: renamed from: p */
    private final int f57131p = 640;

    /* JADX INFO: renamed from: q */
    private Rect f57132q = new Rect();

    /* JADX INFO: renamed from: t */
    private final View.OnClickListener f57135t = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.f57125j.setVisibility(0);
            ImageActivity.this.f57122g.setEnabled(false);
            ImageActivity.this.f57122g.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.f57121f.setEnabled(false);
            ImageActivity.this.f57121f.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageActivity.this.m82104c();
                }
            }).start();
            if (ImageActivity.this.f57127l) {
                ImageActivity.this.m82121a("10657", 0L);
                return;
            }
            ImageActivity.this.m82121a("10655", System.currentTimeMillis() - ImageActivity.this.f57128m);
            if (ImageActivity.this.f57120e.f57156b) {
                ImageActivity.this.m82121a("10654", 0L);
            }
        }
    };

    /* JADX INFO: renamed from: u */
    private final View.OnClickListener f57136u = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.m82121a("10656", System.currentTimeMillis() - ImageActivity.this.f57128m);
            ImageActivity.this.setResult(0);
            ImageActivity.this.m82108d();
        }
    };

    /* JADX INFO: renamed from: v */
    private final IUiListener f57137v = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.5
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            ImageActivity.this.f57122g.setEnabled(true);
            int i = -1;
            ImageActivity.this.f57122g.setTextColor(-1);
            ImageActivity.this.f57121f.setEnabled(true);
            ImageActivity.this.f57121f.setTextColor(-1);
            ImageActivity.this.f57125j.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i = jSONObject.getInt("ret");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ImageActivity imageActivity = ImageActivity.this;
            if (i != 0) {
                imageActivity.m82094a("设置出错了，请重新登录再尝试下呢：）", 1);
                C14363e.m84265a().m84267a(ImageActivity.this.f57117b.getOpenId(), ImageActivity.this.f57117b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "1");
                return;
            }
            imageActivity.m82094a("设置成功", 0);
            ImageActivity.this.m82121a("10658", 0L);
            C14363e.m84265a().m84267a(ImageActivity.this.f57117b.getOpenId(), ImageActivity.this.f57117b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, "3", "0");
            ImageActivity imageActivity2 = ImageActivity.this;
            if (imageActivity2.f57118c != null && !"".equals(ImageActivity.this.f57118c)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity2, ImageActivity.this.f57118c);
                if (imageActivity2.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity2.startActivity(intent);
                }
            }
            ImageActivity.this.m82090a(0, jSONObject.toString(), null, null);
            ImageActivity.this.m82108d();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ImageActivity.this.f57122g.setEnabled(true);
            ImageActivity.this.f57122g.setTextColor(-1);
            ImageActivity.this.f57121f.setEnabled(true);
            ImageActivity.this.f57121f.setTextColor(-1);
            ImageActivity.this.f57121f.setText("重试");
            ImageActivity.this.f57125j.setVisibility(8);
            ImageActivity.this.f57127l = true;
            ImageActivity.this.m82094a(uiError.errorMessage, 1);
            ImageActivity.this.m82121a("10660", 0L);
        }
    };

    /* JADX INFO: renamed from: w */
    private final IUiListener f57138w = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.6
        /* JADX INFO: renamed from: a */
        private void m82122a(int i) {
            if (ImageActivity.this.f57126k < 2) {
                ImageActivity.this.m82110e();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            int i = -1;
            try {
                i = jSONObject.getInt("ret");
                if (i == 0) {
                    final String string = jSONObject.getString("nickname");
                    ImageActivity.this.f57119d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageActivity.this.m82105c(string);
                        }
                    });
                    ImageActivity.this.m82121a("10659", 0L);
                } else {
                    ImageActivity.this.m82121a("10661", 0L);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (i != 0) {
                m82122a(i);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            m82122a(0);
        }
    };

    public class QQAvatarImp extends BaseApi {
        public QQAvatarImp(QQToken qQToken) {
            super(qQToken);
        }

        public void setAvator(Bitmap bitmap, IUiListener iUiListener) {
            Bundle bundleM82145a = m82145a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            BaseApi.TempRequestListener tempRequestListener = new BaseApi.TempRequestListener(iUiListener);
            bundleM82145a.putByteArray("picture", byteArray);
            HttpUtils.requestAsync(this.f57183c, C14390h.m84404a(), "user/set_user_face", bundleM82145a, "POST", tempRequestListener);
            C14363e.m84265a().m84267a(this.f57183c.getOpenId(), this.f57183c.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "0");
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.avatar.ImageActivity$a */
    public class C13819a extends View {
        public C13819a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public void m82123a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableM82098b = ImageActivity.this.m82098b("com.tencent.plus.blue_normal.png");
            Drawable drawableM82098b2 = ImageActivity.this.m82098b("com.tencent.plus.blue_down.png");
            Drawable drawableM82098b3 = ImageActivity.this.m82098b("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableM82098b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableM82098b3);
            button.setBackgroundDrawable(stateListDrawable);
        }

        /* JADX INFO: renamed from: b */
        public void m82124b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableM82098b = ImageActivity.this.m82098b("com.tencent.plus.gray_normal.png");
            Drawable drawableM82098b2 = ImageActivity.this.m82098b("com.tencent.plus.gray_down.png");
            Drawable drawableM82098b3 = ImageActivity.this.m82098b("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableM82098b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableM82098b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableM82098b3);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* JADX INFO: renamed from: a */
    private View m82088a() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f57116a = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f57116a.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(layoutParams3);
        this.f57116a.addView(relativeLayout2);
        C13822c c13822c = new C13822c(this);
        this.f57120e = c13822c;
        c13822c.setLayoutParams(layoutParams2);
        this.f57120e.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout2.addView(this.f57120e);
        this.f57123h = new C13821b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.f57123h.setLayoutParams(layoutParams4);
        relativeLayout2.addView(this.f57123h);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, C13820a.m82128a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f57116a.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C13820a.m82128a(this, 24.0f), C13820a.m82128a(this, 24.0f)));
        imageView.setImageDrawable(m82098b("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.f57124i = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = C13820a.m82128a(this, 7.0f);
        this.f57124i.setLayoutParams(layoutParams6);
        this.f57124i.setEllipsize(TextUtils.TruncateAt.END);
        this.f57124i.setSingleLine();
        this.f57124i.setTextColor(-1);
        this.f57124i.setTextSize(24.0f);
        this.f57124i.setVisibility(8);
        linearLayout.addView(this.f57124i);
        RelativeLayout relativeLayout3 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, C13820a.m82128a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout3.setLayoutParams(layoutParams7);
        relativeLayout3.setBackgroundDrawable(m82098b("com.tencent.plus.bar.png"));
        int iM82128a = C13820a.m82128a(this, 10.0f);
        relativeLayout3.setPadding(iM82128a, iM82128a, iM82128a, 0);
        this.f57116a.addView(relativeLayout3);
        C13819a c13819a = new C13819a(this);
        int iM82128a2 = C13820a.m82128a(this, 14.0f);
        int iM82128a3 = C13820a.m82128a(this, 7.0f);
        this.f57122g = new Button(this);
        this.f57122g.setLayoutParams(new RelativeLayout.LayoutParams(C13820a.m82128a(this, 78.0f), C13820a.m82128a(this, 45.0f)));
        this.f57122g.setText("取消");
        this.f57122g.setTextColor(-1);
        this.f57122g.setTextSize(18.0f);
        this.f57122g.setPadding(iM82128a2, iM82128a3, iM82128a2, iM82128a3);
        c13819a.m82124b(this.f57122g);
        relativeLayout3.addView(this.f57122g);
        this.f57121f = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C13820a.m82128a(this, 78.0f), C13820a.m82128a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.f57121f.setLayoutParams(layoutParams8);
        this.f57121f.setTextColor(-1);
        this.f57121f.setTextSize(18.0f);
        this.f57121f.setPadding(iM82128a2, iM82128a3, iM82128a2, iM82128a3);
        this.f57121f.setText("选取");
        c13819a.m82123a(this.f57121f);
        relativeLayout3.addView(this.f57121f);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, C13820a.m82128a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout3.addView(textView);
        this.f57125j = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.f57125j.setLayoutParams(layoutParams10);
        this.f57125j.setVisibility(8);
        this.f57116a.addView(this.f57125j);
        return this.f57116a;
    }

    /* JADX INFO: renamed from: b */
    private void m82099b() {
        try {
            Bitmap bitmapM82085a = m82085a(this.f57133r);
            this.f57134s = bitmapM82085a;
            if (bitmapM82085a == null) {
                throw new IOException("cannot read picture: '" + this.f57133r + "'!");
            }
            this.f57120e.setImageBitmap(bitmapM82085a);
            this.f57121f.setOnClickListener(this.f57135t);
            this.f57122g.setOnClickListener(this.f57136u);
            this.f57116a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.connect.avatar.ImageActivity.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ImageActivity.this.f57116a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    ImageActivity imageActivity = ImageActivity.this;
                    imageActivity.f57132q = imageActivity.f57123h.m82130a();
                    ImageActivity.this.f57120e.m82138a(ImageActivity.this.f57132q);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            m82094a(Constants.MSG_IMAGE_ERROR, 1);
            m82090a(-5, null, Constants.MSG_IMAGE_ERROR, e.getMessage());
            m82108d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m82104c() {
        float fWidth = this.f57132q.width();
        Matrix imageMatrix = this.f57120e.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float f4 = 640.0f / fWidth;
        Rect rect = this.f57132q;
        int i = (int) ((rect.left - f) / f3);
        int i2 = i < 0 ? 0 : i;
        int i3 = (int) ((rect.top - f2) / f3);
        int i4 = i3 < 0 ? 0 : i3;
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(f4, f4);
        int i5 = (int) (650.0f / f3);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f57134s, i2, i4, Math.min(this.f57134s.getWidth() - i2, i5), Math.min(this.f57134s.getHeight() - i4, i5), matrix, true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, 640, 640);
            bitmapCreateBitmap.recycle();
            m82091a(bitmapCreateBitmap2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            m82094a(Constants.MSG_IMAGE_ERROR, 1);
            m82090a(-5, null, Constants.MSG_IMAGE_ERROR, e.getMessage());
            m82108d();
        }
    }

    /* JADX INFO: renamed from: d */
    private String m82107d(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m82110e() {
        this.f57126k++;
        new UserInfo(this, this.f57117b).getUserInfo(this.f57138w);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        m82108d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(m82088a());
        this.f57119d = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(Constants.KEY_PARAMS);
        this.f57133r = bundleExtra.getString("picture");
        this.f57118c = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString("access_token");
        long j = bundleExtra.getLong("expires_in");
        String string3 = bundleExtra.getString("openid");
        this.f57129n = bundleExtra.getInt("exitAnim");
        QQToken qQToken = new QQToken(string);
        this.f57117b = qQToken;
        qQToken.setAccessToken(string2, ((j - System.currentTimeMillis()) / 1000) + "");
        this.f57117b.setOpenId(string3);
        m82099b();
        m82110e();
        this.f57128m = System.currentTimeMillis();
        m82121a("10653", 0L);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f57120e.setImageBitmap(null);
        Bitmap bitmap = this.f57134s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f57134s.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m82108d() {
        finish();
        int i = this.f57129n;
        if (i != 0) {
            overridePendingTransition(0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public Drawable m82098b(String str) {
        return C14396n.m84461a(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82102b(String str, int i) {
        Toast toastMakeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) toastMakeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C13820a.m82128a(this, 16.0f), C13820a.m82128a(this, 16.0f)));
        if (i == 0) {
            imageView.setImageDrawable(m82098b("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(m82098b("com.tencent.plus.ic_error.png"));
        }
        linearLayout.addView(imageView, 0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        toastMakeText.setView(linearLayout);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m82105c(String str) {
        String strM82107d = m82107d(str);
        if ("".equals(strM82107d)) {
            return;
        }
        this.f57124i.setText(strM82107d);
        this.f57124i.setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m82085a(String str) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        Uri uri = Uri.parse(str);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        inputStreamOpenInputStream.close();
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        while (i2 * i3 > 4194304) {
            i2 /= 2;
            i3 /= 2;
            i *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        try {
            return BitmapFactory.decodeStream(getContentResolver().openInputStream(uri), null, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82091a(Bitmap bitmap) {
        new QQAvatarImp(this.f57117b).setAvator(bitmap, this.f57137v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82094a(final String str, final int i) {
        this.f57119d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.m82102b(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82090a(int i, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_ERROR_CODE, i);
        intent.putExtra(Constants.KEY_ERROR_MSG, str2);
        intent.putExtra(Constants.KEY_ERROR_DETAIL, str3);
        intent.putExtra(Constants.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    /* JADX INFO: renamed from: a */
    public void m82121a(String str, long j) {
        m82095a(str, j, this.f57117b.getAppId());
    }

    /* JADX INFO: renamed from: a */
    public static void m82095a(String str, long j, String str2) {
        HashMap map = new HashMap();
        map.put("strValue", str2);
        map.put("nValue", str);
        map.put("qver", Constants.SDK_VERSION);
        if (j != 0) {
            map.put("elt", String.valueOf(j));
        }
        C14366h.m84276a().m84281a("https://cgi.qplus.com/report/report", map);
    }
}
