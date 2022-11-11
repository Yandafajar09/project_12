<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">


<LinearLayout
        android:id="@+id/linearLayout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent">

<TextView
            android:id="@+id/textView"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:background="@color/teal_700"
                    android:text="BAGIAN HEADER"
                    android:textAlignment="center"
                    android:textAppearance="@style/TextAppearance.AppCompat.Display1" />
</LinearLayout>

<ScrollView
        android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="1.0"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/linearLayout">

<LinearLayout
            android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:orientation="vertical" >

<TextView
                android:id="@+id/labelNPM"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="NPM"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<EditText
                android:id="@+id/isiNPM"
                        style="@style/Widget.AppCompat.AutoCompleteTextView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:ems="10"
                        android:hint="Masukkan NPM"
                        android:inputType="textPersonName"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<TextView
                android:id="@+id/LabelNama"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Nama"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<EditText
                android:id="@+id/isiNama"
                        style="@style/Widget.AppCompat.AutoCompleteTextView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:ems="10"
                        android:hint="Masukkan Nama"
                        android:inputType="textPersonName"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<TextView
                android:id="@+id/labelJK"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Jenis Kelamin"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<RadioGroup
                android:id="@+id/rgJK"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent" >

<RadioButton
                    android:id="@+id/rPria"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:text="Pria" />

<RadioButton
                    android:id="@+id/rPerempuan"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:text="Perampuan" />

</RadioGroup>

<TextView
                android:id="@+id/labelKelas"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Jenis Kelamin"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<Spinner
                android:id="@+id/sKelas"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:minHeight="48dp"
                        tools:ignore="SpeakableTextPresentCheck" />

<TextView
                android:id="@+id/labelAgama"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Agama"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<Spinner
                android:id="@+id/sAgama"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:minHeight="48dp"
                        tools:ignore="SpeakableTextPresentCheck" />

<TextView
                android:id="@+id/labeltempatLahir"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Tempat Lahir"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<EditText
                android:id="@+id/isiTempatLahir"
                        style="@style/Widget.AppCompat.AutoCompleteTextView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:ems="10"
                        android:hint="Masukkan Nama"
                        android:inputType="textPersonName"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<EditText
                android:id="@+id/tanggalLahir"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:ems="10"
                        android:inputType="date"
                        android:minHeight="48dp"
                        tools:ignore="SpeakableTextPresentCheck" />

<TextView
                android:id="@+id/labelTanggalLahir"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Tempat Lahir"
                        android:textAppearance="@style/TextAppearance.AppCompat.Display1" />

<Button
                android:id="@+id/Simpan"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="SIMPAN" />

<TextView
                android:id="@+id/hasil"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content" />
</LinearLayout>
</ScrollView>

</androidx.constraintlayout.widget.ConstraintLayout>