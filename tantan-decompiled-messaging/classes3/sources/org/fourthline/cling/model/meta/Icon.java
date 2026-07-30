package org.fourthline.cling.model.meta;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import l.qkq0;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.types.BinHexDatatype;
import org.seamless.util.MimeType;
import org.seamless.util.URIUtil;
import org.seamless.util.p006io.C0944IO;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Icon implements Validatable {
    private static final Logger log = Logger.getLogger(StateVariable.class.getName());
    private final byte[] data;
    private final int depth;
    private Device device;
    private final int height;
    private final MimeType mimeType;
    private final URI uri;
    private final int width;

    public Icon(String str, int i, int i2, int i3, String str2, String str3) {
        this(str, i, i2, i3, str2, (str3 == null || str3.equals("")) ? null : new BinHexDatatype().valueOf(str3));
    }

    public Icon deepCopy() {
        return new Icon(getMimeType(), getWidth(), getHeight(), getDepth(), getUri(), getData());
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDepth() {
        return this.depth;
    }

    public Device getDevice() {
        return this.device;
    }

    public int getHeight() {
        return this.height;
    }

    public MimeType getMimeType() {
        return this.mimeType;
    }

    public URI getUri() {
        return this.uri;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDevice(Device device) {
        if (this.device == null) {
            this.device = device;
        } else {
            qkq0.a("Final value has been set already, model is immutable");
        }
    }

    public String toString() {
        return "Icon(" + getWidth() + "x" + getHeight() + ", MIME: " + getMimeType() + ") " + getUri();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (getMimeType() == null) {
            Logger logger = log;
            logger.warning("UPnP specification violation of: " + getDevice());
            logger.warning("Invalid icon, missing mime type: " + this);
        }
        if (getWidth() == 0) {
            Logger logger2 = log;
            logger2.warning("UPnP specification violation of: " + getDevice());
            logger2.warning("Invalid icon, missing width: " + this);
        }
        if (getHeight() == 0) {
            Logger logger3 = log;
            logger3.warning("UPnP specification violation of: " + getDevice());
            logger3.warning("Invalid icon, missing height: " + this);
        }
        if (getDepth() == 0) {
            Logger logger4 = log;
            logger4.warning("UPnP specification violation of: " + getDevice());
            logger4.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (getUri() == null) {
            arrayList.add(new ValidationError(getClass(), "uri", "URL is required"));
            return arrayList;
        }
        try {
            if (getUri().toURL() == null) {
                throw new MalformedURLException();
            }
        } catch (IllegalArgumentException unused) {
        } catch (MalformedURLException e) {
            arrayList.add(new ValidationError(getClass(), "uri", "URL must be valid: " + e.getMessage()));
        }
        return arrayList;
    }

    public Icon(String str, int i, int i2, int i3, URL url) throws IOException {
        this(str, i, i2, i3, new File(URIUtil.toURI(url)));
    }

    public Icon(String str, int i, int i2, int i3, File file) throws IOException {
        this(str, i, i2, i3, file.getName(), C0944IO.readBytes(file));
    }

    public Icon(String str, int i, int i2, int i3, String str2, InputStream inputStream) throws IOException {
        this(str, i, i2, i3, str2, C0944IO.readBytes(inputStream));
    }

    public Icon(String str, int i, int i2, int i3, String str2, byte[] bArr) {
        this((str == null || str.length() <= 0) ? null : MimeType.valueOf(str), i, i2, i3, URI.create(str2), bArr);
    }

    public Icon(String str, int i, int i2, int i3, URI uri) {
        this((str == null || str.length() <= 0) ? null : MimeType.valueOf(str), i, i2, i3, uri, (byte[]) null);
    }

    public Icon(MimeType mimeType, int i, int i2, int i3, URI uri, byte[] bArr) {
        this.mimeType = mimeType;
        this.width = i;
        this.height = i2;
        this.depth = i3;
        this.uri = uri;
        this.data = bArr;
    }
}
