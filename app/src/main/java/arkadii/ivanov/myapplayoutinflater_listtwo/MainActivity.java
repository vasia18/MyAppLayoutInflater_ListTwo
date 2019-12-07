package arkadii.ivanov.myapplayoutinflater_listtwo;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView.Adapter;

public class MainActivity extends AppCompatActivity {

	// Определяем масив типа String. И строку, которую мы выводим в список.
	private String[] name = {"Мясоо со сливками", "Гренки", "Яишница", "Тест", "Сок", "Суп", "Конфеты", "Вкусняшки", "Новое", "Скоро на работу", "Рыба", "Хлеб", "Ручка", "стол", "стол два",};

	// Определяем масив типа String. И строку, которую мы выводим в список.
	private String[] position = {"Новое описание пока похоже на рыба текст. Но скоро будет настоящее описание.", "новое один? Новое описание пока похоже на рыба текст. Но скоро будет настоящее описание", "новое два", "новое три", "новое чтыре", "новое пять", "новое шесть", "новое семь", "новое восемь", "нвое девять", "новое десять", "новое одинадцать", "новое двенадцать", "новое тринадцать", "новое четырнадцать", "новое пятнадцать",};

	//Определяем масив типа int. И картинки которые мы выводим в список.
	int[] Images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img6, R.drawable.img7};

	int[] minutes = {5, 12,20,12,5,35,23,7, 85, 19, 10, 101, 12, 13, 14,};

	int[] salary = {12, 22, 30, 14, 50, 346, 7, 85, 19, 10, 101, 12, 13, 14, 15};

	int[] colors = new int[2];

	//Создаем свой Adapter.
	//private NewAdapter mAdapter;





	/**
	 * Вызывается при первом создании действия
	 */

	//int[] colors = new int[2];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//mAdapter = new NewAdapter(this);
		//setListAdapter(mAdapter);

		colors[0] = Color.parseColor("#ECECEC");
		colors[1] = Color.parseColor("#ECECEC");


		LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

		LayoutInflater ItInflater = getLayoutInflater();

		for (int i = 0; i < name.length; i++) {
			Log.d("myLogs", "i = " + i);
			View item = ItInflater.inflate(R.layout.item, linLayout, false);

			TextView tvName = (TextView) item.findViewById(R.id.tvName);
			tvName.setText(name[i]);

			TextView tvPosition = (TextView) item.findViewById(R.id.tvPosition);
			tvPosition.setText("описание: " + position[i]);

			TextView tvMinutes = (TextView) item.findViewById(R.id.tvMinutes);
			tvMinutes.setText(minutes + "минут");

			TextView tvSalary = (TextView) item.findViewById(R.id.tvSalary);
			tvSalary.setText(String.valueOf(salary[i]));

			item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
			item.setBackgroundColor(colors[i % 2]);
			linLayout.addView(item);

		}


	}


}
