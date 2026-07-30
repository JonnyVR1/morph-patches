package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class h5w extends hs10 implements c5w {
    private boolean assetRes;
    private Context context;
    private String filePath;
    private float intensity;
    private int intensityHandler;
    private Bitmap lookupBitmap;
    private int lookup_texture;
    private int resId;

    public h5w(Context context, int i) {
        super(2);
        this.intensity = 1.0f;
        this.assetRes = false;
        this.context = context;
        this.resId = i;
        this.lookupBitmap = decodeLookupBitmapResource();
    }

    private Bitmap decodeLookupAssetsRes() throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        Bitmap bitmapDecodeStream = null;
        try {
            inputStreamOpen = this.context.getResources().getAssets().open(this.filePath);
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    inputStreamOpen.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
            inputStreamOpen.close();
            throw th;
        }
        try {
            inputStreamOpen.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return bitmapDecodeStream;
    }

    private Bitmap decodeLookupBitmapFile() {
        if (TextUtils.isEmpty(this.filePath)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeFile(this.filePath, options);
    }

    private Bitmap decodeLookupBitmapResource() {
        if (this.context == null || this.resId <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(this.context.getResources(), this.resId, options);
    }

    @Override // p153l.hs10, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.lookup_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.lookup_texture = 0;
        }
        Bitmap bitmap = this.lookupBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.lookupBitmap.recycle();
        this.lookupBitmap = null;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.intensityHandler = GLES20.glGetUniformLocation(this.programHandle, "intensity");
    }

    @Override // p153l.hs10, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        Bitmap bitmapDecodeLookupAssetsRes;
        if (this.filterLocations.size() < 2 || !gfjVar.equals(this.filterLocations.get(0))) {
            clearRegisteredFilterLocations();
            registerFilterLocation(gfjVar, 0);
            registerFilterLocation(this, 1);
        }
        if (this.lookup_texture == 0) {
            Bitmap bitmap = this.lookupBitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.resId > 0) {
                    bitmapDecodeLookupAssetsRes = decodeLookupBitmapResource();
                } else {
                    bitmapDecodeLookupAssetsRes = this.assetRes ? decodeLookupAssetsRes() : decodeLookupBitmapFile();
                }
                this.lookupBitmap = bitmapDecodeLookupAssetsRes;
            }
            this.lookup_texture = oim.m167794a(this.lookupBitmap);
        }
        super.newTextureReady(this.lookup_texture, this, z);
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.intensityHandler, this.intensity);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.lookup_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.lookup_texture = 0;
        }
    }

    public void setAssetResourcesId(Context context, String str) {
        this.context = context;
        this.filePath = str;
        this.assetRes = true;
    }

    @Override // p153l.c5w
    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLookUpPath(String str) {
        this.filePath = str;
    }

    public void setLookupBitmap(Bitmap bitmap) {
        this.lookupBitmap = bitmap;
    }

    public h5w() {
        super(2);
        this.intensity = 1.0f;
        this.assetRes = false;
    }

    public h5w(Context context, String str) {
        super(2);
        this.intensity = 1.0f;
        this.assetRes = false;
        this.filePath = str;
        this.lookupBitmap = decodeLookupBitmapFile();
    }
}
