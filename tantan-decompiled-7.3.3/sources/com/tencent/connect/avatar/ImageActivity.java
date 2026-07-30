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
import com.tencent.open.p110b.C14526e;
import com.tencent.open.p110b.C14529h;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14559n;
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

/* JADX INFO: loaded from: classes12.dex */
public class ImageActivity extends Activity {

    /* JADX INFO: renamed from: a */
    RelativeLayout f57964a;

    /* JADX INFO: renamed from: b */
    private QQToken f57965b;

    /* JADX INFO: renamed from: c */
    private String f57966c;

    /* JADX INFO: renamed from: d */
    private Handler f57967d;

    /* JADX INFO: renamed from: e */
    private C13985c f57968e;

    /* JADX INFO: renamed from: f */
    private Button f57969f;

    /* JADX INFO: renamed from: g */
    private Button f57970g;

    /* JADX INFO: renamed from: h */
    private C13984b f57971h;

    /* JADX INFO: renamed from: i */
    private TextView f57972i;

    /* JADX INFO: renamed from: j */
    private ProgressBar f57973j;

    /* JADX INFO: renamed from: r */
    private String f57981r;

    /* JADX INFO: renamed from: s */
    private Bitmap f57982s;

    /* JADX INFO: renamed from: k */
    private int f57974k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f57975l = false;

    /* JADX INFO: renamed from: m */
    private long f57976m = 0;

    /* JADX INFO: renamed from: n */
    private int f57977n = 0;

    /* JADX INFO: renamed from: o */
    private final int f57978o = 640;

    /* JADX INFO: renamed from: p */
    private final int f57979p = 640;

    /* JADX INFO: renamed from: q */
    private Rect f57980q = new Rect();

    /* JADX INFO: renamed from: t */
    private final View.OnClickListener f57983t = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.f57973j.setVisibility(0);
            ImageActivity.this.f57970g.setEnabled(false);
            ImageActivity.this.f57970g.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.f57969f.setEnabled(false);
            ImageActivity.this.f57969f.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageActivity.this.m83287c();
                }
            }).start();
            if (ImageActivity.this.f57975l) {
                ImageActivity.this.m83304a("10657", 0L);
                return;
            }
            ImageActivity.this.m83304a("10655", System.currentTimeMillis() - ImageActivity.this.f57976m);
            if (ImageActivity.this.f57968e.f58004b) {
                ImageActivity.this.m83304a("10654", 0L);
            }
        }
    };

    /* JADX INFO: renamed from: u */
    private final View.OnClickListener f57984u = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.m83304a("10656", System.currentTimeMillis() - ImageActivity.this.f57976m);
            ImageActivity.this.setResult(0);
            ImageActivity.this.m83291d();
        }
    };

    /* JADX INFO: renamed from: v */
    private final IUiListener f57985v = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.5
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            ImageActivity.this.f57970g.setEnabled(true);
            int i = -1;
            ImageActivity.this.f57970g.setTextColor(-1);
            ImageActivity.this.f57969f.setEnabled(true);
            ImageActivity.this.f57969f.setTextColor(-1);
            ImageActivity.this.f57973j.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i = jSONObject.getInt("ret");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ImageActivity imageActivity = ImageActivity.this;
            if (i != 0) {
                imageActivity.m83277a("设置出错了，请重新登录再尝试下呢：）", 1);
                C14526e.m85448a().m85450a(ImageActivity.this.f57965b.getOpenId(), ImageActivity.this.f57965b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "1");
                return;
            }
            imageActivity.m83277a("设置成功", 0);
            ImageActivity.this.m83304a("10658", 0L);
            C14526e.m85448a().m85450a(ImageActivity.this.f57965b.getOpenId(), ImageActivity.this.f57965b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, "3", "0");
            ImageActivity imageActivity2 = ImageActivity.this;
            if (imageActivity2.f57966c != null && !"".equals(ImageActivity.this.f57966c)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity2, ImageActivity.this.f57966c);
                if (imageActivity2.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity2.startActivity(intent);
                }
            }
            ImageActivity.this.m83273a(0, jSONObject.toString(), null, null);
            ImageActivity.this.m83291d();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ImageActivity.this.f57970g.setEnabled(true);
            ImageActivity.this.f57970g.setTextColor(-1);
            ImageActivity.this.f57969f.setEnabled(true);
            ImageActivity.this.f57969f.setTextColor(-1);
            ImageActivity.this.f57969f.setText("重试");
            ImageActivity.this.f57973j.setVisibility(8);
            ImageActivity.this.f57975l = true;
            ImageActivity.this.m83277a(uiError.errorMessage, 1);
            ImageActivity.this.m83304a("10660", 0L);
        }
    };

    /* JADX INFO: renamed from: w */
    private final IUiListener f57986w = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.6
        /* JADX INFO: renamed from: a */
        private void m83305a(int i) {
            if (ImageActivity.this.f57974k < 2) {
                ImageActivity.this.m83293e();
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
                    ImageActivity.this.f57967d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageActivity.this.m83288c(string);
                        }
                    });
                    ImageActivity.this.m83304a("10659", 0L);
                } else {
                    ImageActivity.this.m83304a("10661", 0L);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (i != 0) {
                m83305a(i);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            m83305a(0);
        }
    };

    public class QQAvatarImp extends BaseApi {
        public QQAvatarImp(QQToken qQToken) {
            super(qQToken);
        }

        public void setAvator(Bitmap bitmap, IUiListener iUiListener) {
            Bundle bundleM83328a = m83328a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            BaseApi.TempRequestListener tempRequestListener = new BaseApi.TempRequestListener(iUiListener);
            bundleM83328a.putByteArray("picture", byteArray);
            HttpUtils.requestAsync(this.f58031c, C14553h.m85587a(), "user/set_user_face", bundleM83328a, "POST", tempRequestListener);
            C14526e.m85448a().m85450a(this.f58031c.getOpenId(), this.f58031c.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_ACT_TYPE_NINETEEN, "0");
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.avatar.ImageActivity$a */
    public class C13982a extends View {
        public C13982a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public void m83306a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableM83281b = ImageActivity.this.m83281b("com.tencent.plus.blue_normal.png");
            Drawable drawableM83281b2 = ImageActivity.this.m83281b("com.tencent.plus.blue_down.png");
            Drawable drawableM83281b3 = ImageActivity.this.m83281b("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableM83281b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableM83281b3);
            button.setBackgroundDrawable(stateListDrawable);
        }

        /* JADX INFO: renamed from: b */
        public void m83307b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableM83281b = ImageActivity.this.m83281b("com.tencent.plus.gray_normal.png");
            Drawable drawableM83281b2 = ImageActivity.this.m83281b("com.tencent.plus.gray_down.png");
            Drawable drawableM83281b3 = ImageActivity.this.m83281b("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableM83281b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableM83281b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableM83281b3);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* JADX INFO: renamed from: a */
    private View m83271a() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f57964a = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f57964a.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(layoutParams3);
        this.f57964a.addView(relativeLayout2);
        C13985c c13985c = new C13985c(this);
        this.f57968e = c13985c;
        c13985c.setLayoutParams(layoutParams2);
        this.f57968e.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout2.addView(this.f57968e);
        this.f57971h = new C13984b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.f57971h.setLayoutParams(layoutParams4);
        relativeLayout2.addView(this.f57971h);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, C13983a.m83311a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f57964a.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C13983a.m83311a(this, 24.0f), C13983a.m83311a(this, 24.0f)));
        imageView.setImageDrawable(m83281b("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.f57972i = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = C13983a.m83311a(this, 7.0f);
        this.f57972i.setLayoutParams(layoutParams6);
        this.f57972i.setEllipsize(TextUtils.TruncateAt.END);
        this.f57972i.setSingleLine();
        this.f57972i.setTextColor(-1);
        this.f57972i.setTextSize(24.0f);
        this.f57972i.setVisibility(8);
        linearLayout.addView(this.f57972i);
        RelativeLayout relativeLayout3 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, C13983a.m83311a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout3.setLayoutParams(layoutParams7);
        relativeLayout3.setBackgroundDrawable(m83281b("com.tencent.plus.bar.png"));
        int iM83311a = C13983a.m83311a(this, 10.0f);
        relativeLayout3.setPadding(iM83311a, iM83311a, iM83311a, 0);
        this.f57964a.addView(relativeLayout3);
        C13982a c13982a = new C13982a(this);
        int iM83311a2 = C13983a.m83311a(this, 14.0f);
        int iM83311a3 = C13983a.m83311a(this, 7.0f);
        this.f57970g = new Button(this);
        this.f57970g.setLayoutParams(new RelativeLayout.LayoutParams(C13983a.m83311a(this, 78.0f), C13983a.m83311a(this, 45.0f)));
        this.f57970g.setText("取消");
        this.f57970g.setTextColor(-1);
        this.f57970g.setTextSize(18.0f);
        this.f57970g.setPadding(iM83311a2, iM83311a3, iM83311a2, iM83311a3);
        c13982a.m83307b(this.f57970g);
        relativeLayout3.addView(this.f57970g);
        this.f57969f = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C13983a.m83311a(this, 78.0f), C13983a.m83311a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.f57969f.setLayoutParams(layoutParams8);
        this.f57969f.setTextColor(-1);
        this.f57969f.setTextSize(18.0f);
        this.f57969f.setPadding(iM83311a2, iM83311a3, iM83311a2, iM83311a3);
        this.f57969f.setText("选取");
        c13982a.m83306a(this.f57969f);
        relativeLayout3.addView(this.f57969f);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, C13983a.m83311a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout3.addView(textView);
        this.f57973j = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.f57973j.setLayoutParams(layoutParams10);
        this.f57973j.setVisibility(8);
        this.f57964a.addView(this.f57973j);
        return this.f57964a;
    }

    /* JADX INFO: renamed from: b */
    private void m83282b() {
        try {
            Bitmap bitmapM83268a = m83268a(this.f57981r);
            this.f57982s = bitmapM83268a;
            if (bitmapM83268a == null) {
                throw new IOException("cannot read picture: '" + this.f57981r + "'!");
            }
            this.f57968e.setImageBitmap(bitmapM83268a);
            this.f57969f.setOnClickListener(this.f57983t);
            this.f57970g.setOnClickListener(this.f57984u);
            this.f57964a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.connect.avatar.ImageActivity.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ImageActivity.this.f57964a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    ImageActivity imageActivity = ImageActivity.this;
                    imageActivity.f57980q = imageActivity.f57971h.m83313a();
                    ImageActivity.this.f57968e.m83321a(ImageActivity.this.f57980q);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            m83277a(Constants.MSG_IMAGE_ERROR, 1);
            m83273a(-5, null, Constants.MSG_IMAGE_ERROR, e.getMessage());
            m83291d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83287c() {
        float fWidth = this.f57980q.width();
        Matrix imageMatrix = this.f57968e.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float f4 = 640.0f / fWidth;
        Rect rect = this.f57980q;
        int i = (int) ((rect.left - f) / f3);
        int i2 = i < 0 ? 0 : i;
        int i3 = (int) ((rect.top - f2) / f3);
        int i4 = i3 < 0 ? 0 : i3;
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(f4, f4);
        int i5 = (int) (650.0f / f3);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f57982s, i2, i4, Math.min(this.f57982s.getWidth() - i2, i5), Math.min(this.f57982s.getHeight() - i4, i5), matrix, true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, 640, 640);
            bitmapCreateBitmap.recycle();
            m83274a(bitmapCreateBitmap2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            m83277a(Constants.MSG_IMAGE_ERROR, 1);
            m83273a(-5, null, Constants.MSG_IMAGE_ERROR, e.getMessage());
            m83291d();
        }
    }

    /* JADX INFO: renamed from: d */
    private String m83290d(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m83293e() {
        this.f57974k++;
        new UserInfo(this, this.f57965b).getUserInfo(this.f57986w);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        m83291d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(m83271a());
        this.f57967d = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(Constants.KEY_PARAMS);
        this.f57981r = bundleExtra.getString("picture");
        this.f57966c = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString("access_token");
        long j = bundleExtra.getLong("expires_in");
        String string3 = bundleExtra.getString("openid");
        this.f57977n = bundleExtra.getInt("exitAnim");
        QQToken qQToken = new QQToken(string);
        this.f57965b = qQToken;
        qQToken.setAccessToken(string2, ((j - System.currentTimeMillis()) / 1000) + "");
        this.f57965b.setOpenId(string3);
        m83282b();
        m83293e();
        this.f57976m = System.currentTimeMillis();
        m83304a("10653", 0L);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f57968e.setImageBitmap(null);
        Bitmap bitmap = this.f57982s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f57982s.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m83291d() {
        finish();
        int i = this.f57977n;
        if (i != 0) {
            overridePendingTransition(0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public Drawable m83281b(String str) {
        return C14559n.m85644a(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83285b(String str, int i) {
        Toast toastMakeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) toastMakeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C13983a.m83311a(this, 16.0f), C13983a.m83311a(this, 16.0f)));
        if (i == 0) {
            imageView.setImageDrawable(m83281b("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(m83281b("com.tencent.plus.ic_error.png"));
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
    public void m83288c(String str) {
        String strM83290d = m83290d(str);
        if ("".equals(strM83290d)) {
            return;
        }
        this.f57972i.setText(strM83290d);
        this.f57972i.setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m83268a(String str) throws IOException {
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
    private void m83274a(Bitmap bitmap) {
        new QQAvatarImp(this.f57965b).setAvator(bitmap, this.f57985v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83277a(final String str, final int i) {
        this.f57967d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.m83285b(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83273a(int i, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_ERROR_CODE, i);
        intent.putExtra(Constants.KEY_ERROR_MSG, str2);
        intent.putExtra(Constants.KEY_ERROR_DETAIL, str3);
        intent.putExtra(Constants.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    /* JADX INFO: renamed from: a */
    public void m83304a(String str, long j) {
        m83278a(str, j, this.f57965b.getAppId());
    }

    /* JADX INFO: renamed from: a */
    public static void m83278a(String str, long j, String str2) {
        HashMap map = new HashMap();
        map.put("strValue", str2);
        map.put("nValue", str);
        map.put("qver", Constants.SDK_VERSION);
        if (j != 0) {
            map.put("elt", String.valueOf(j));
        }
        C14529h.m85459a().m85464a("https://cgi.qplus.com/report/report", map);
    }
}
