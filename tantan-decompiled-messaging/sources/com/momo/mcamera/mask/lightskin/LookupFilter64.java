package com.momo.mcamera.mask.lightskin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import p149l.e3w;
import p149l.lgm;
import p149l.mcj;
import p149l.xj10;

/* JADX INFO: loaded from: classes7.dex */
public class LookupFilter64 extends xj10 implements e3w {
    private boolean assetRes;
    private Context context;
    private String filePath;
    private float intensity;
    private int intensityHandler;
    private Bitmap lookupBitmap;
    private int lookup_texture;
    private int resId;

    public LookupFilter64(Context context, int i) {
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

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
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

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 15.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 4.0);\n  quad1.x = floor(blueColor) - (quad1.y * 4.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 4.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 4.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.25) + 0.5/64.0 + ((0.25 - 1.0/64.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.25) + 0.5/64.0 + ((0.25 - 1.0/64.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.25) + 0.5/64.0 + ((0.25 - 1.0/64.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.25) + 0.5/64.0 + ((0.25 - 1.0/64.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.intensityHandler = GLES20.glGetUniformLocation(this.programHandle, "intensity");
    }

    @Override // p149l.xj10, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Bitmap bitmapDecodeLookupAssetsRes;
        if (this.filterLocations.size() < 2 || !mcjVar.equals(this.filterLocations.get(0))) {
            clearRegisteredFilterLocations();
            registerFilterLocation(mcjVar, 0);
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
            this.lookup_texture = lgm.m149781a(this.lookupBitmap);
        }
        super.newTextureReady(this.lookup_texture, this, z);
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.intensityHandler, this.intensity);
    }

    @Override // p149l.mcj, p149l.ccj
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

    @Override // p149l.e3w
    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLookUpPath(String str) {
        this.filePath = str;
    }

    public void setLookupBitmap(Bitmap bitmap) {
        this.lookupBitmap = bitmap;
    }

    public LookupFilter64() {
        super(2);
        this.intensity = 1.0f;
        this.assetRes = false;
    }

    public LookupFilter64(Context context, String str) {
        super(2);
        this.intensity = 1.0f;
        this.assetRes = false;
        this.filePath = str;
        this.lookupBitmap = decodeLookupBitmapFile();
    }
}
